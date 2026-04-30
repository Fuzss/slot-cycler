package fuzs.slotcycler.neoforge.client;

import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.slotcycler.common.SlotCycler;
import fuzs.slotcycler.common.client.SlotCyclerClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = SlotCycler.MOD_ID, dist = Dist.CLIENT)
public class SlotCyclerNeoForgeClient {

    public SlotCyclerNeoForgeClient() {
        ClientModConstructor.construct(SlotCycler.MOD_ID, SlotCyclerClient::new);
    }
}
