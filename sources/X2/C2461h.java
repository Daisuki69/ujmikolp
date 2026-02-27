package x2;

import com.google.firebase.encoders.EncodingException;
import u2.C2294b;
import u2.InterfaceC2298f;

/* JADX INFO: renamed from: x2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2461h implements InterfaceC2298f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20889a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20890b = false;
    public C2294b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2459f f20891d;

    public C2461h(C2459f c2459f) {
        this.f20891d = c2459f;
    }

    @Override // u2.InterfaceC2298f
    public final InterfaceC2298f add(String str) {
        if (this.f20889a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20889a = true;
        this.f20891d.c(this.c, str, this.f20890b);
        return this;
    }

    @Override // u2.InterfaceC2298f
    public final InterfaceC2298f add(boolean z4) {
        if (!this.f20889a) {
            this.f20889a = true;
            this.f20891d.b(this.c, z4 ? 1 : 0, this.f20890b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
