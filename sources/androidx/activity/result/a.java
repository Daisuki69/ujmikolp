package androidx.activity.result;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7326b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f7325a = i;
        this.f7326b = function1;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f7325a) {
            case 0:
                this.f7326b.invoke(obj);
                break;
            default:
                this.f7326b.invoke(obj);
                break;
        }
    }
}
