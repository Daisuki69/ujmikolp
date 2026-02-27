package A3;

import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import java.util.concurrent.atomic.AtomicReference;
import y3.C2503d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f42a = new AtomicReference();

    public static zzkd a(C2503d c2503d) {
        zzjx zzjxVar = new zzjx();
        c2503d.getClass();
        zzjxVar.zzd(zzka.ALL_LANDMARKS);
        zzjxVar.zza(zzjy.ALL_CLASSIFICATIONS);
        zzjxVar.zzf(zzkb.ACCURATE);
        zzjxVar.zzb(zzjz.NO_CONTOURS);
        zzjxVar.zzc(Boolean.FALSE);
        zzjxVar.zze(Float.valueOf(0.1f));
        return zzjxVar.zzk();
    }

    public static boolean b() {
        AtomicReference atomicReference = f42a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z4 = DynamiteModule.getLocalVersion(p3.g.c().b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z4));
        return z4;
    }
}
