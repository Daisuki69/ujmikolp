package Gj;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements M5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2032b;

    @Override // M5.f
    public String d() {
        switch (this.f2031a) {
            case 1:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", Arrays.copyOf(new Object[]{"decoration", TtmlNode.ATTR_ID, this.f2032b}, 3));
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "bank", "bank_code", this.f2032b);
        }
    }

    public String toString() {
        switch (this.f2031a) {
            case 0:
                return androidx.camera.core.impl.a.n(new StringBuilder("<"), this.f2032b, '>');
            default:
                return super.toString();
        }
    }

    public t(String mDecorationId, int i) {
        this.f2031a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.g(mDecorationId, "mDecorationId");
                this.f2032b = mDecorationId;
                break;
            default:
                this.f2032b = mDecorationId;
                break;
        }
    }
}
