package pl.asie.charset.pipes;

import net.minecraftforge.fml.client.registry.ClientRegistry;

import mcmultipart.client.multipart.MultipartRegistryClient;
import pl.asie.charset.pipes.client.RendererPipePart;
import pl.asie.charset.pipes.client.RendererShifterTile;

public class ProxyClient extends ProxyCommon {
	@Override
	public void registerRenderers() {
        MultipartRegistryClient.bindMultipartSpecialRenderer(PartPipe.class, new RendererPipePart());
		ClientRegistry.bindTileEntitySpecialRenderer(TileShifter.class, new RendererShifterTile());
    }
}
