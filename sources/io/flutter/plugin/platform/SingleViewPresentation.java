package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.lN8Dz0.yf3D09;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes4.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C1617a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private w rootView;
    private boolean startFocused;
    private final z state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, k kVar, C1617a c1617a, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new x(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1617a;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        z zVar = new z();
        this.state = zVar;
        zVar.f17269a = kVar;
        dLgao9.setFlags(getWindow(), 8, 8);
        getWindow().setType(2030);
    }

    public z detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        w wVar = this.rootView;
        if (wVar != null) {
            wVar.removeAllViews();
        }
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            fChUQ4.onUserInteraction();
        }
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public k getView() {
        return this.state.f17269a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        z zVar = this.state;
        if (zVar.c == null) {
            zVar.c = new v(getContext());
        }
        if (this.state.f17270b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            z zVar2 = this.state;
            zVar2.f17270b = new F(windowManager, zVar2.c);
        }
        this.container = new yf3D09(getContext());
        y yVar = new y(getContext(), this.state.f17270b, this.outerContext);
        View view = this.state.f17269a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(yVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        w wVar = new w(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = wVar;
        wVar.addView(this.container);
        this.rootView.addView(this.state.c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C1617a c1617a, z zVar, View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new x(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1617a;
        this.state = zVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        dLgao9.setFlags(getWindow(), 8, 8);
        this.startFocused = z4;
    }
}
