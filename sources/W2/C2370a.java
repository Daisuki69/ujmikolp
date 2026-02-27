package w2;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;
import x2.C2459f;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2370a implements InterfaceC2295c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20675a;

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        switch (this.f20675a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
                interfaceC2296d.add(C2459f.f20884g, entry.getKey());
                interfaceC2296d.add(C2459f.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
