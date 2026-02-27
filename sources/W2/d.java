package W2;

import a3.C0627d;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.messaging.r;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import e2.C1420b;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f6215a;

    public /* synthetic */ d(e eVar) {
        this.f6215a = eVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return this.f6215a.a();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        e eVar = this.f6215a;
        eVar.getClass();
        if (task.isSuccessful()) {
            X2.d dVar = eVar.c;
            synchronized (dVar) {
                dVar.c = Tasks.forResult(null);
            }
            dVar.f6479b.a();
            X2.f fVar = (X2.f) task.getResult();
            if (fVar != null) {
                JSONArray jSONArray = fVar.f6485d;
                V1.b bVar = eVar.f6216a;
                if (bVar != null) {
                    try {
                        bVar.c(e.i(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e7) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e7);
                    }
                }
                r rVar = eVar.j;
                try {
                    C0627d c0627dI = ((Y.e) rVar.c).i(fVar);
                    Iterator it = ((Set) rVar.e).iterator();
                    while (it.hasNext()) {
                        ((Executor) rVar.f9804d).execute(new Y2.a((C1420b) it.next(), c0627dI, 0));
                    }
                } catch (FirebaseRemoteConfigException e10) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
