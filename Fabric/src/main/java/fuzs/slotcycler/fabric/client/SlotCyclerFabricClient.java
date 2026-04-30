package fuzs.slotcycler.fabric.client;

import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.slotcycler.common.SlotCycler;
import fuzs.slotcycler.common.client.SlotCyclerClient;
import net.fabricmc.api.ClientModInitializer;

public class SlotCyclerFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(SlotCycler.MOD_ID, SlotCyclerClient::new);
    }
}
