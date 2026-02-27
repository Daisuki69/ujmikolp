package o4;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import pg.k;
import pg.l;
import pg.m;
import pg.n;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1961a implements FlutterPlugin, ActivityAware, m, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f18772b;
    public boolean c;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        View viewFindViewById = activityPluginBinding.getActivity().findViewById(R.id.content);
        this.f18772b = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        new n(flutterPluginBinding.getBinaryMessenger(), "flutter_keyboard_visibility").a(this);
    }

    @Override // pg.m
    public final void onCancel(Object obj) {
        this.f18771a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        View view = this.f18772b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18772b = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.f18772b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18772b = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        View view = this.f18772b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18772b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f18772b != null) {
            Rect rect = new Rect();
            this.f18772b.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f18772b.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.c) {
                this.c = r02;
                l lVar = this.f18771a;
                if (lVar != null) {
                    lVar.success(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // pg.m
    public final void onListen(Object obj, k kVar) {
        this.f18771a = (l) kVar;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        View viewFindViewById = activityPluginBinding.getActivity().findViewById(R.id.content);
        this.f18772b = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
