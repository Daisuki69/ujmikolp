package w1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.exoplayer.ExoPlayer;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20653A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f20654B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f20656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f20657b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f20658d;
    public final ViewGroup e;
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f20659g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f20660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f20661l;
    public final AnimatorSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f20662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f20663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f20664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f20665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f20666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f20667s = new u(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f20668t = new u(this, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u f20669u = new u(this, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f20670v = new u(this, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f20671w = new u(this, 6);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC2369g f20672x = new ViewOnLayoutChangeListenerC2369g(this, 1);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20655C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20674z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f20673y = new ArrayList();

    public z(t tVar) {
        final int i = 2;
        this.f20656a = tVar;
        final int i4 = 0;
        final int i6 = 1;
        this.f20657b = tVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) tVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) tVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) tVar.findViewById(R.id.exo_bottom_bar);
        this.f20658d = viewGroup;
        this.i = (ViewGroup) tVar.findViewById(R.id.exo_time);
        View viewFindViewById = tVar.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) tVar.findViewById(R.id.exo_basic_controls);
        this.f20659g = (ViewGroup) tVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) tVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = tVar.findViewById(R.id.exo_overflow_show);
        this.f20660k = viewFindViewById2;
        View viewFindViewById3 = tVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: w1.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f20648b;

                {
                    this.f20648b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            z zVar = this.f20648b;
                            Callback.onClick_enter(view);
                            try {
                                zVar.e(view);
                                return;
                            } finally {
                            }
                        default:
                            z zVar2 = this.f20648b;
                            Callback.onClick_enter(view);
                            try {
                                zVar2.e(view);
                                return;
                            } finally {
                            }
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: w1.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f20648b;

                {
                    this.f20648b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            z zVar = this.f20648b;
                            Callback.onClick_enter(view);
                            try {
                                zVar.e(view);
                                return;
                            } finally {
                            }
                        default:
                            z zVar2 = this.f20648b;
                            Callback.onClick_enter(view);
                            try {
                                zVar2.e(view);
                                return;
                            } finally {
                            }
                    }
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f20646b;

            {
                this.f20646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        z zVar = this.f20646b;
                        zVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f20657b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        z zVar2 = this.f20646b;
                        zVar2.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar2.f20657b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = zVar2.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar2.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                    case 2:
                        z zVar3 = this.f20646b;
                        zVar3.getClass();
                        zVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        z zVar4 = this.f20646b;
                        zVar4.getClass();
                        zVar4.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new x(this, i4));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f20646b;

            {
                this.f20646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        z zVar = this.f20646b;
                        zVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f20657b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        z zVar2 = this.f20646b;
                        zVar2.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar2.f20657b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = zVar2.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar2.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                    case 2:
                        z zVar3 = this.f20646b;
                        zVar3.getClass();
                        zVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        z zVar4 = this.f20646b;
                        zVar4.getClass();
                        zVar4.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new x(this, i6));
        Resources resources = tVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f20661l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new y(this, tVar, i4));
        animatorSet.play(valueAnimatorOfFloat).with(d(0.0f, dimension, viewFindViewById)).with(d(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new y(this, tVar, i6));
        animatorSet2.play(d(dimension, dimension2, viewFindViewById)).with(d(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f20662n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new y(this, tVar, i));
        animatorSet3.play(valueAnimatorOfFloat).with(d(0.0f, dimension2, viewFindViewById)).with(d(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f20663o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new x(this, i));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(dimension, 0.0f, viewFindViewById)).with(d(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f20664p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new x(this, 3));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(dimension2, 0.0f, viewFindViewById)).with(d(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f20665q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f20646b;

            {
                this.f20646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        z zVar = this.f20646b;
                        zVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f20657b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        z zVar2 = this.f20646b;
                        zVar2.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar2.f20657b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = zVar2.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar2.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                    case 2:
                        z zVar3 = this.f20646b;
                        zVar3.getClass();
                        zVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        z zVar4 = this.f20646b;
                        zVar4.getClass();
                        zVar4.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new x(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f20666r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        final int i10 = 3;
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f20646b;

            {
                this.f20646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        z zVar = this.f20646b;
                        zVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = zVar.f20657b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = zVar.c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = zVar.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        z zVar2 = this.f20646b;
                        zVar2.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = zVar2.f20657b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = zVar2.c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = zVar2.e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                    case 2:
                        z zVar3 = this.f20646b;
                        zVar3.getClass();
                        zVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        z zVar4 = this.f20646b;
                        zVar4.getClass();
                        zVar4.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new x(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(float f, float f3, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f3);
    }

    public static boolean k(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f20673y.contains(view);
    }

    public final void e(View view) {
        h();
        if (view.getId() == R.id.exo_overflow_show) {
            this.f20665q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            this.f20666r.start();
        }
    }

    public final void f(Runnable runnable, long j) {
        if (j >= 0) {
            this.f20656a.postDelayed(runnable, j);
        }
    }

    public final void g() {
        u uVar = this.f20671w;
        t tVar = this.f20656a;
        tVar.removeCallbacks(uVar);
        tVar.removeCallbacks(this.f20668t);
        tVar.removeCallbacks(this.f20670v);
        tVar.removeCallbacks(this.f20669u);
    }

    public final void h() {
        if (this.f20674z == 3) {
            return;
        }
        g();
        int showTimeoutMs = this.f20656a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f20655C) {
                f(this.f20671w, showTimeoutMs);
            } else if (this.f20674z == 1) {
                f(this.f20669u, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            } else {
                f(this.f20670v, showTimeoutMs);
            }
        }
    }

    public final void i(View view, boolean z4) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f20673y;
        if (!z4) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f20653A && k(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void j(int i) {
        int i4 = this.f20674z;
        this.f20674z = i;
        t tVar = this.f20656a;
        if (i == 2) {
            tVar.setVisibility(8);
        } else if (i4 == 2) {
            tVar.setVisibility(0);
        }
        if (i4 != i) {
            for (s sVar : tVar.f20606b) {
                tVar.getVisibility();
                ((ViewOnLayoutChangeListenerC2362A) sVar).f20519a.updateContentDescription();
            }
        }
    }

    public final void l() {
        if (!this.f20655C) {
            j(0);
            h();
            return;
        }
        int i = this.f20674z;
        if (i == 1) {
            this.f20663o.start();
        } else if (i == 2) {
            this.f20664p.start();
        } else if (i == 3) {
            this.f20654B = true;
        } else if (i == 4) {
            return;
        }
        h();
    }
}
