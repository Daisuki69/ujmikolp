package androidx.navigation.ui;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.messaging.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements NavigationView.OnNavigationItemSelectedListener, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8162b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Context context, Intent intent, boolean z4) {
        this.f8162b = context;
        this.c = intent;
        this.f8161a = z4;
    }

    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return NavigationUI.m126setupWithNavController$lambda5((NavController) this.f8162b, this.f8161a, (NavigationView) this.c, menuItem);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? i.a((Context) this.f8162b, (Intent) this.c, this.f8161a).continueWith(new androidx.arch.core.executor.a(2), new androidx.media3.extractor.flv.a(28)) : task;
    }

    public /* synthetic */ b(NavigationView navigationView, NavController navController, boolean z4) {
        this.f8162b = navController;
        this.f8161a = z4;
        this.c = navigationView;
    }
}
