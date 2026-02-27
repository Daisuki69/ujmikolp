package androidx.navigation.ui;

import android.view.View;
import androidx.navigation.NavController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavController f8160b;
    public final /* synthetic */ AppBarConfiguration c;

    public /* synthetic */ a(NavController navController, AppBarConfiguration appBarConfiguration, int i) {
        this.f8159a = i;
        this.f8160b = navController;
        this.c = appBarConfiguration;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8159a) {
            case 0:
                NavigationUI.m121x4b1ca597(this.f8160b, this.c, view);
                break;
            default:
                NavigationUI.m122xd53ea1d8(this.f8160b, this.c, view);
                break;
        }
    }
}
