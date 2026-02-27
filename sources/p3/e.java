package p3;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    @GuardedBy("instances")
    private final Map zza = new HashMap();

    public abstract Object create(Object obj);

    @NonNull
    @KeepForSdk
    public Object get(@NonNull Object obj) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(obj)) {
                    return this.zza.get(obj);
                }
                Object objCreate = create(obj);
                this.zza.put(obj, objCreate);
                return objCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
