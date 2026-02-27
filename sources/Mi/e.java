package Mi;

import android.view.KeyEvent;
import com.google.firebase.messaging.r;
import io.flutter.embedding.android.KeyEmbedderResponder;
import io.flutter.embedding.android.KeyboardMap;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3413b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3414d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(f fVar, HashSet hashSet, HashSet hashSet2, long j) {
        this.c = fVar;
        this.f3414d = hashSet;
        this.e = hashSet2;
        this.f3413b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3412a) {
            case 0:
                r rVar = (r) ((f) this.c).f3416b;
                HashSet hashSet = (HashSet) this.f3414d;
                HashSet hashSet2 = (HashSet) this.e;
                ((SplitRoomDatabase) rVar.c).runInTransaction(new h((Gi.d) rVar.e, (RuleBasedSegmentDao) rVar.f9803b, (Ji.a) rVar.f9804d, hashSet, hashSet2, this.f3413b));
                break;
            default:
                ((KeyEmbedderResponder) this.c).lambda$synchronizePressingKey$0((KeyboardMap.KeyPair) this.f3414d, this.f3413b, (KeyEvent) this.e);
                break;
        }
    }

    public /* synthetic */ e(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        this.c = keyEmbedderResponder;
        this.f3414d = keyPair;
        this.f3413b = j;
        this.e = keyEvent;
    }
}
