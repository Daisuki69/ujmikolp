package X2;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6472b;
    public final /* synthetic */ c c;

    public b(c cVar, int i, long j) {
        this.c = cVar;
        this.f6471a = i;
        this.f6472b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.c;
        int i = this.f6471a;
        final long j = this.f6472b;
        synchronized (cVar) {
            final int i4 = i - 1;
            final Task taskD = ((j) cVar.f6475d).d(3 - i4);
            final Task taskB = ((d) cVar.e).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskB}).continueWithTask((ScheduledExecutorService) cVar.f6476g, new Continuation() { // from class: X2.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    JSONObject jSONObject;
                    c cVar2 = cVar;
                    Task task2 = taskD;
                    Task task3 = taskB;
                    long j6 = j;
                    int i6 = i4;
                    cVar2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    i iVar = (i) task2.getResult();
                    f fVarA = (f) task3.getResult();
                    f fVar = iVar.f6493b;
                    if (fVar != null) {
                        boolValueOf = Boolean.valueOf(fVar.f >= j6);
                    } else {
                        boolValueOf = Boolean.valueOf(iVar.f6492a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.a(i6, j6);
                        return Tasks.forResult(null);
                    }
                    if (iVar.f6493b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (fVarA == null) {
                        fVarA = f.c().a();
                    }
                    f fVar2 = iVar.f6493b;
                    f fVarA2 = f.a(new JSONObject(fVar2.f6483a.toString()));
                    HashMap mapB = fVarA.b();
                    HashMap mapB2 = fVar2.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = fVarA.f6484b;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (true) {
                        boolean zHasNext = itKeys.hasNext();
                        jSONObject = fVarA2.f6484b;
                        if (!zHasNext) {
                            break;
                        }
                        String next = itKeys.next();
                        JSONObject jSONObject3 = fVar2.f6484b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = fVarA.e;
                            boolean zHas = jSONObject4.has(next);
                            JSONObject jSONObject5 = fVar2.e;
                            if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    W2.a aVar = new W2.a(hashSet);
                    synchronized (cVar2) {
                        Iterator it = ((LinkedHashSet) cVar2.f6474b).iterator();
                        while (it.hasNext()) {
                            ((W2.c) it.next()).onUpdate(aVar);
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
