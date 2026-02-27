package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f7318b;

    public /* synthetic */ f(ComponentActivity componentActivity, int i) {
        this.f7317a = i;
        this.f7318b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7317a) {
            case 0:
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(this.f7318b);
                break;
            default:
                this.f7318b.invalidateMenu();
                break;
        }
    }
}
