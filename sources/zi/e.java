package zi;

import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import d4.AbstractC1331a;
import io.split.android.client.service.workmanager.MySegmentsSyncWorker;
import io.split.android.client.service.workmanager.splits.SplitsSyncWorker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n4.RunnableC1918b;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1918b f21462a;

    public e(RunnableC1918b runnableC1918b) {
        this.f21462a = runnableC1918b;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<WorkInfo> list = (List) obj;
        if (list == null) {
            return;
        }
        for (WorkInfo workInfo : list) {
            Ri.a.d("Work manager task: " + workInfo.getTags() + ", state: " + workInfo.getState());
            f fVar = (f) this.f21462a.c;
            if (fVar.f != null && workInfo.getTags() != null && WorkInfo.State.ENQUEUED.equals(workInfo.getState())) {
                Set<String> tags = workInfo.getTags();
                int i = tags.contains(SplitsSyncWorker.class.getCanonicalName()) ? 1 : tags.contains(MySegmentsSyncWorker.class.getCanonicalName()) ? 2 : 0;
                if (i != 0) {
                    HashSet hashSet = fVar.f21466g;
                    if (hashSet.contains(AbstractC1331a.w(i))) {
                        ki.e eVar = (ki.e) fVar.f.get();
                        if (eVar != null) {
                            Ri.a.d("Updating for ".concat(AbstractC1331a.z(i)));
                            eVar.b(Ff.f.k(i));
                        }
                    } else {
                        Ri.a.d("Avoiding update for ".concat(AbstractC1331a.z(i)));
                        hashSet.add(AbstractC1331a.w(i));
                    }
                }
            }
        }
    }
}
