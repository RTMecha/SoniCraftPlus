package net.mcreator.sonicraft_plus.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.sonicraft_plus.SonicraftPlusMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SonicraftPlusModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		SonicraftPlusMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.savedGamemode = original.savedGamemode;
			if (!event.isWasDeath()) {
				clone.whiteWispActive = original.whiteWispActive;
				clone.cyanWispActive = original.cyanWispActive;
				clone.yellowWispActive = original.yellowWispActive;
				clone.orangeWispActive = original.orangeWispActive;
				clone.redWispActive = original.redWispActive;
				clone.violetWispActive = original.violetWispActive;
				clone.burstJump = original.burstJump;
				clone.blueWispActive = original.blueWispActive;
				clone.greenWispActive = original.greenWispActive;
				clone.pinkWispActive = original.pinkWispActive;
				clone.purpleWispActive = original.purpleWispActive;
				clone.cubeCooldown = original.cubeCooldown;
				clone.jadeWispActive = original.jadeWispActive;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("sonicraft_plus", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean whiteWispActive = false;
		public boolean cyanWispActive = false;
		public boolean yellowWispActive = false;
		public boolean orangeWispActive = false;
		public boolean redWispActive = false;
		public boolean violetWispActive = false;
		public boolean burstJump = false;
		public boolean blueWispActive = false;
		public boolean greenWispActive = false;
		public boolean pinkWispActive = false;
		public boolean purpleWispActive = false;
		public double cubeCooldown = 0;
		public boolean jadeWispActive = false;
		public double savedGamemode = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				SonicraftPlusMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("whiteWispActive", whiteWispActive);
			nbt.putBoolean("cyanWispActive", cyanWispActive);
			nbt.putBoolean("yellowWispActive", yellowWispActive);
			nbt.putBoolean("orangeWispActive", orangeWispActive);
			nbt.putBoolean("redWispActive", redWispActive);
			nbt.putBoolean("violetWispActive", violetWispActive);
			nbt.putBoolean("burstJump", burstJump);
			nbt.putBoolean("blueWispActive", blueWispActive);
			nbt.putBoolean("greenWispActive", greenWispActive);
			nbt.putBoolean("pinkWispActive", pinkWispActive);
			nbt.putBoolean("purpleWispActive", purpleWispActive);
			nbt.putDouble("cubeCooldown", cubeCooldown);
			nbt.putBoolean("jadeWispActive", jadeWispActive);
			nbt.putDouble("savedGamemode", savedGamemode);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			whiteWispActive = nbt.getBoolean("whiteWispActive");
			cyanWispActive = nbt.getBoolean("cyanWispActive");
			yellowWispActive = nbt.getBoolean("yellowWispActive");
			orangeWispActive = nbt.getBoolean("orangeWispActive");
			redWispActive = nbt.getBoolean("redWispActive");
			violetWispActive = nbt.getBoolean("violetWispActive");
			burstJump = nbt.getBoolean("burstJump");
			blueWispActive = nbt.getBoolean("blueWispActive");
			greenWispActive = nbt.getBoolean("greenWispActive");
			pinkWispActive = nbt.getBoolean("pinkWispActive");
			purpleWispActive = nbt.getBoolean("purpleWispActive");
			cubeCooldown = nbt.getDouble("cubeCooldown");
			jadeWispActive = nbt.getBoolean("jadeWispActive");
			savedGamemode = nbt.getDouble("savedGamemode");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SonicraftPlusMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.whiteWispActive = message.data.whiteWispActive;
					variables.cyanWispActive = message.data.cyanWispActive;
					variables.yellowWispActive = message.data.yellowWispActive;
					variables.orangeWispActive = message.data.orangeWispActive;
					variables.redWispActive = message.data.redWispActive;
					variables.violetWispActive = message.data.violetWispActive;
					variables.burstJump = message.data.burstJump;
					variables.blueWispActive = message.data.blueWispActive;
					variables.greenWispActive = message.data.greenWispActive;
					variables.pinkWispActive = message.data.pinkWispActive;
					variables.purpleWispActive = message.data.purpleWispActive;
					variables.cubeCooldown = message.data.cubeCooldown;
					variables.jadeWispActive = message.data.jadeWispActive;
					variables.savedGamemode = message.data.savedGamemode;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
