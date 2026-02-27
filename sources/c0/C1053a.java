package c0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053a implements InterfaceC1054b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9182b;

    public C1053a(int i) {
        this.f9181a = i;
        switch (i) {
            case 1:
                this.f9182b = new ArrayList();
                break;
            default:
                this.f9182b = new ArrayList();
                break;
        }
    }

    @Override // c0.InterfaceC1054b
    public final void a(JSONArray batch, boolean z4) {
        switch (this.f9181a) {
            case 0:
                kotlin.jvm.internal.j.g(batch, "batch");
                int length = batch.length();
                for (int i = 0; i < length; i++) {
                    if (kotlin.jvm.internal.j.b(batch.getJSONObject(i).optString("evtName"), "App Launched") && z4) {
                        Iterator it = this.f9182b.iterator();
                        while (it.hasNext()) {
                            ((Function0) it.next()).invoke();
                        }
                    }
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.j.g(batch, "batch");
                Iterator it2 = this.f9182b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1054b) it2.next()).a(batch, z4);
                }
                break;
        }
    }
}
