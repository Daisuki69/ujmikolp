package androidx.media3.common;

import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GlTextureInfo {
    public static final GlTextureInfo UNSET = new GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public GlTextureInfo(int i, int i4, int i6, int i10, int i11) {
        this.texId = i;
        this.fboId = i4;
        this.rboId = i6;
        this.width = i10;
        this.height = i11;
    }

    public void release() throws GlUtil.GlException {
        int i = this.texId;
        if (i != -1) {
            GlUtil.deleteTexture(i);
        }
        int i4 = this.fboId;
        if (i4 != -1) {
            GlUtil.deleteFbo(i4);
        }
        int i6 = this.rboId;
        if (i6 != -1) {
            GlUtil.deleteRbo(i6);
        }
    }
}
