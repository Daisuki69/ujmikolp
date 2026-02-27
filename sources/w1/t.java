package w1;

import M8.T2;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.exoplayer2.ExoPlayer;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.AbstractC1902h;
import n1.C1892E;
import n1.C1893F;
import n1.C1910p;
import n1.InterfaceC1896b;
import n1.InterfaceC1911q;
import v1.C2335b;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends FrameLayout {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final o6.f f20587A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f20588B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final ImageView f20589B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final ImageView f20590C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final ImageView f20591D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final View f20592E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final View f20593F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final View f20594G0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final float f20595K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final float f20596P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f20597Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final String f20598R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Drawable f20599S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Drawable f20600T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final String f20601U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f20602V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public n1.y f20603W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20604a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC1896b f20605a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f20606b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f20607b0;
    public final View c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f20608c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f20609d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f20610d0;
    public final View e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f20611e0;
    public final View f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f20612f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f20613g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f20614g0;
    public final ImageView h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f20615h0;
    public final ImageView i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long[] f20616i0;
    public final View j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean[] f20617j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f20618k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long[] f20619k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f20620l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean[] f20621l0;
    public final D m;
    public long m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final StringBuilder f20622n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final long f20623n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Formatter f20624o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final long f20625o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1892E f20626p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final z f20627p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1893F f20628q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Resources f20629q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RunnableC2367e f20630r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RecyclerView f20631r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Drawable f20632s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final n f20633s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Drawable f20634t;
    public final k t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f20635u;
    public final PopupWindow u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f20636v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f20637v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f20638w;
    public final int w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f20639x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public C2335b f20640x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Drawable f20641y;
    public final p y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final h f20642z0;

    static {
        HashSet hashSet = AbstractC1902h.f18571a;
        synchronized (AbstractC1902h.class) {
            if (AbstractC1902h.f18571a.add("goog.exo.ui")) {
                AbstractC1902h.f18572b += ", goog.exo.ui";
            }
        }
    }

    public t(Context context, AttributeSet attributeSet) {
        boolean z4;
        boolean z5;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        super(context, null, 0);
        this.f20623n0 = 5000L;
        this.f20625o0 = androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        this.f20612f0 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        this.f20615h0 = 0;
        this.f20614g0 = 200;
        int resourceId = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2366d.c, 0, 0);
            try {
                this.f20623n0 = typedArrayObtainStyledAttributes.getInt(11, (int) this.f20623n0);
                this.f20625o0 = typedArrayObtainStyledAttributes.getInt(7, (int) this.f20625o0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f20612f0 = typedArrayObtainStyledAttributes.getInt(23, this.f20612f0);
                this.f20615h0 = typedArrayObtainStyledAttributes.getInt(10, this.f20615h0);
                z5 = typedArrayObtainStyledAttributes.getBoolean(20, true);
                z8 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                z9 = typedArrayObtainStyledAttributes.getBoolean(19, true);
                z10 = typedArrayObtainStyledAttributes.getBoolean(18, true);
                z12 = typedArrayObtainStyledAttributes.getBoolean(21, false);
                z13 = typedArrayObtainStyledAttributes.getBoolean(22, false);
                z11 = typedArrayObtainStyledAttributes.getBoolean(24, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(25, this.f20614g0));
                z4 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            z4 = true;
            z5 = true;
            z8 = true;
            z9 = true;
            z10 = true;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        i iVar = new i(this);
        this.f20604a = iVar;
        this.f20606b = new CopyOnWriteArrayList();
        this.f20626p = new C1892E();
        this.f20628q = new C1893F();
        StringBuilder sb2 = new StringBuilder();
        this.f20622n = sb2;
        this.f20624o = new Formatter(sb2, Locale.getDefault());
        this.f20616i0 = new long[0];
        this.f20617j0 = new boolean[0];
        this.f20619k0 = new long[0];
        this.f20621l0 = new boolean[0];
        boolean z14 = z4;
        this.f20605a0 = new T2.g(this.f20625o0, this.f20623n0);
        this.f20630r = new RunnableC2367e(this, 0);
        this.f20618k = (TextView) findViewById(R.id.exo_duration);
        this.f20620l = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f20589B0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(iVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f20590C0 = imageView2;
        final int i = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: w1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f20565b;

            {
                this.f20565b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        t tVar = this.f20565b;
                        Callback.onClick_enter(view);
                        try {
                            tVar.getClass();
                            return;
                        } finally {
                        }
                    default:
                        t tVar2 = this.f20565b;
                        Callback.onClick_enter(view);
                        try {
                            tVar2.getClass();
                            return;
                        } finally {
                        }
                }
            }
        };
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f20591D0 = imageView3;
        final int i4 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: w1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f20565b;

            {
                this.f20565b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        t tVar = this.f20565b;
                        Callback.onClick_enter(view);
                        try {
                            tVar.getClass();
                            return;
                        } finally {
                        }
                    default:
                        t tVar2 = this.f20565b;
                        Callback.onClick_enter(view);
                        try {
                            tVar2.getClass();
                            return;
                        } finally {
                        }
                }
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f20592E0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(iVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f20593F0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(iVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f20594G0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(iVar);
        }
        D d10 = (D) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (d10 != null) {
            this.m = d10;
        } else if (viewFindViewById4 != null) {
            C2365c c2365c = new C2365c(context, attributeSet);
            c2365c.setId(R.id.exo_progress);
            c2365c.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c2365c, iIndexOfChild);
            this.m = c2365c;
        } else {
            this.m = null;
        }
        D d11 = this.m;
        if (d11 != null) {
            ((C2365c) d11).f20557x.add(iVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(iVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(iVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f20609d = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(iVar);
        }
        Typeface font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        if (textView != null) {
            textView.setTypeface(font);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f20613g = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(iVar);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        if (textView2 != null) {
            textView2.setTypeface(font);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(iVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.h = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(iVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.i = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(iVar);
        }
        Resources resources = context.getResources();
        this.f20629q0 = resources;
        boolean z15 = z11;
        this.f20595K = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f20596P = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.j = viewFindViewById10;
        if (viewFindViewById10 != null) {
            j(viewFindViewById10, false);
        }
        z zVar = new z(this);
        this.f20627p0 = zVar;
        zVar.f20655C = z14;
        boolean z16 = z13;
        n nVar = new n(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f20633s0 = nVar;
        this.w0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        boolean z17 = z12;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f20631r0 = recyclerView;
        recyclerView.setAdapter(nVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.u0 = popupWindow;
        if (AbstractC2550e.f21351a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(iVar);
        this.f20637v0 = true;
        this.f20587A0 = new o6.f(getResources());
        this.f20599S = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.f20600T = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.f20601U = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f20602V = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.y0 = new p(this);
        this.f20642z0 = new h(this);
        this.t0 = new k(this, resources.getStringArray(R.array.exo_playback_speeds), resources.getIntArray(R.array.exo_speed_multiplied_by_100));
        resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.f20632s = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.f20634t = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.f20635u = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.f20641y = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.f20588B = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        resources.getString(R.string.exo_controls_fullscreen_exit_description);
        resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f20636v = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f20638w = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f20639x = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f20597Q = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f20598R = resources.getString(R.string.exo_controls_shuffle_off_description);
        zVar.i((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        zVar.i(viewFindViewById9, z8);
        zVar.i(viewFindViewById8, z5);
        zVar.i(viewFindViewById6, z9);
        zVar.i(viewFindViewById7, z10);
        zVar.i(imageView5, z17);
        zVar.i(imageView, z16);
        zVar.i(viewFindViewById10, z15);
        zVar.i(imageView4, this.f20615h0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2369g(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        n1.y yVar = this.f20603W;
        if (yVar == null) {
            return;
        }
        InterfaceC1896b interfaceC1896b = this.f20605a0;
        C1910p c1910p = new C1910p(f, yVar.getPlaybackParameters().f18580b);
        ((T2.g) interfaceC1896b).getClass();
        yVar.setPlaybackParameters(c1910p);
    }

    public final boolean b(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        n1.y yVar = this.f20603W;
        if (yVar == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (yVar.getPlaybackState() != 4) {
                    T2.g gVar = (T2.g) this.f20605a0;
                    if (gVar.f5758b > 0 && yVar.isCurrentWindowSeekable()) {
                        T2.g.c(yVar, gVar.f5758b);
                    }
                }
            } else if (keyCode == 89) {
                T2.g gVar2 = (T2.g) this.f20605a0;
                if (gVar2.f5757a > 0 && yVar.isCurrentWindowSeekable()) {
                    T2.g.c(yVar, -gVar2.f5757a);
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    int playbackState = yVar.getPlaybackState();
                    if (playbackState == 1 || playbackState == 4 || !yVar.getPlayWhenReady()) {
                        c(yVar);
                    } else {
                        ((T2.g) this.f20605a0).getClass();
                        yVar.setPlayWhenReady(false);
                    }
                } else if (keyCode == 87) {
                    ((T2.g) this.f20605a0).a(yVar);
                } else if (keyCode == 88) {
                    ((T2.g) this.f20605a0).b(yVar);
                } else if (keyCode == 126) {
                    c(yVar);
                } else if (keyCode == 127) {
                    ((T2.g) this.f20605a0).getClass();
                    yVar.setPlayWhenReady(false);
                }
            }
        }
        return true;
    }

    public final void c(n1.y yVar) {
        int playbackState = yVar.getPlaybackState();
        if (playbackState == 1) {
            ((T2.g) this.f20605a0).getClass();
            yVar.prepare();
        } else if (playbackState == 4) {
            int currentWindowIndex = yVar.getCurrentWindowIndex();
            ((T2.g) this.f20605a0).getClass();
            yVar.seekTo(currentWindowIndex, androidx.media3.common.C.TIME_UNSET);
        }
        ((T2.g) this.f20605a0).getClass();
        yVar.setPlayWhenReady(true);
    }

    public final void d(RecyclerView.Adapter adapter) {
        this.f20631r0.setAdapter(adapter);
        p();
        this.f20637v0 = false;
        PopupWindow popupWindow = this.u0;
        popupWindow.dismiss();
        this.f20637v0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.w0;
        popupWindow.showAsDropDown(this, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(T2 t22, int i, ArrayList arrayList) {
        t22.getClass();
        throw null;
    }

    public final void f() {
        z zVar = this.f20627p0;
        int i = zVar.f20674z;
        if (i == 3 || i == 2) {
            return;
        }
        zVar.g();
        if (!zVar.f20655C) {
            zVar.j(2);
        } else if (zVar.f20674z == 1) {
            zVar.m.start();
        } else {
            zVar.f20662n.start();
        }
    }

    public final boolean g() {
        z zVar = this.f20627p0;
        return zVar.f20674z == 0 && zVar.f20656a.h();
    }

    @Nullable
    public n1.y getPlayer() {
        return this.f20603W;
    }

    public int getRepeatToggleModes() {
        return this.f20615h0;
    }

    public boolean getShowShuffleButton() {
        return this.f20627p0.b(this.i);
    }

    public boolean getShowSubtitleButton() {
        return this.f20627p0.b(this.f20589B0);
    }

    public int getShowTimeoutMs() {
        return this.f20612f0;
    }

    public boolean getShowVrButton() {
        return this.f20627p0.b(this.j);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    public final void j(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.setEnabled(z4);
        view.setAlpha(z4 ? this.f20595K : this.f20596P);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r5 = this;
            boolean r0 = r5.h()
            if (r0 == 0) goto L57
            boolean r0 = r5.f20607b0
            if (r0 != 0) goto Lb
            goto L57
        Lb:
            n1.y r0 = r5.f20603W
            r1 = 0
            if (r0 == 0) goto L38
            n1.G r2 = r0.getCurrentTimeline()
            boolean r3 = r2.n()
            if (r3 != 0) goto L38
            boolean r3 = r0.isPlayingAd()
            if (r3 != 0) goto L38
            int r3 = r0.getCurrentWindowIndex()
            n1.F r4 = r5.f20628q
            r2.l(r3, r4)
            r4.getClass()
            r4.a()
            r4.a()
            boolean r0 = r0.hasNext()
            r2 = 1
            goto L3a
        L38:
            r0 = r1
            r2 = r0
        L3a:
            android.view.View r3 = r5.c
            r5.j(r3, r2)
            android.view.View r2 = r5.f20613g
            r5.j(r2, r1)
            android.view.View r2 = r5.f
            r5.j(r2, r1)
            android.view.View r2 = r5.f20609d
            r5.j(r2, r0)
            w1.D r0 = r5.m
            if (r0 == 0) goto L57
            w1.c r0 = (w1.C2365c) r0
            r0.setEnabled(r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.t.k():void");
    }

    public final void l() {
        View view;
        if (h() && this.f20607b0 && (view = this.e) != null) {
            n1.y yVar = this.f20603W;
            Resources resources = this.f20629q0;
            if (yVar == null || yVar.getPlaybackState() == 4 || this.f20603W.getPlaybackState() == 1 || !this.f20603W.getPlayWhenReady()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            }
        }
    }

    public final void m() {
        n1.y yVar = this.f20603W;
        if (yVar == null) {
            return;
        }
        float f = yVar.getPlaybackParameters().f18579a;
        k kVar = this.t0;
        kVar.getClass();
        int iRound = Math.round(f * 100.0f);
        int i = Integer.MAX_VALUE;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = kVar.f20571b;
            if (i4 >= iArr.length) {
                kVar.c = i6;
                this.f20633s0.f20577b[0] = kVar.f20570a[kVar.c];
                return;
            } else {
                int iAbs = Math.abs(iRound - iArr[i4]);
                if (iAbs < i) {
                    i6 = i4;
                    i = iAbs;
                }
                i4++;
            }
        }
    }

    public final void n() {
        long contentPosition;
        long contentBufferedPosition;
        if (h() && this.f20607b0) {
            n1.y yVar = this.f20603W;
            if (yVar != null) {
                contentPosition = yVar.getContentPosition() + this.m0;
                contentBufferedPosition = yVar.getContentBufferedPosition() + this.m0;
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            TextView textView = this.f20620l;
            if (textView != null && !this.f20611e0) {
                textView.setText(AbstractC2550e.d(this.f20622n, this.f20624o, contentPosition));
            }
            D d10 = this.m;
            if (d10 != null) {
                C2365c c2365c = (C2365c) d10;
                c2365c.setPosition(contentPosition);
                c2365c.setBufferedPosition(contentBufferedPosition);
            }
            RunnableC2367e runnableC2367e = this.f20630r;
            removeCallbacks(runnableC2367e);
            int playbackState = yVar == null ? 1 : yVar.getPlaybackState();
            if (yVar == null || !yVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(runnableC2367e, 1000L);
                return;
            }
            long jMin = Math.min(d10 != null ? ((C2365c) d10).getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = yVar.getPlaybackParameters().f18579a;
            long j = f > 0.0f ? (long) (jMin / f) : 1000L;
            long j6 = this.f20614g0;
            int i = AbstractC2550e.f21351a;
            postDelayed(runnableC2367e, Math.max(j6, Math.min(j, 1000L)));
        }
    }

    public final void o() {
        ImageView imageView;
        if (h() && this.f20607b0 && (imageView = this.h) != null) {
            if (this.f20615h0 == 0) {
                j(imageView, false);
                return;
            }
            n1.y yVar = this.f20603W;
            String str = this.f20636v;
            Drawable drawable = this.f20632s;
            if (yVar == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int repeatMode = yVar.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.f20634t);
                imageView.setContentDescription(this.f20638w);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f20635u);
                imageView.setContentDescription(this.f20639x);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z zVar = this.f20627p0;
        zVar.f20656a.addOnLayoutChangeListener(zVar.f20672x);
        this.f20607b0 = true;
        if (g()) {
            zVar.h();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z zVar = this.f20627p0;
        zVar.f20656a.removeOnLayoutChangeListener(zVar.f20672x);
        this.f20607b0 = false;
        removeCallbacks(this.f20630r);
        zVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        super.onLayout(z4, i, i4, i6, i10);
        View view = this.f20627p0.f20657b;
        if (view != null) {
            view.layout(0, 0, i6 - i, i10 - i4);
        }
    }

    public final void p() {
        RecyclerView recyclerView = this.f20631r0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.w0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.u0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void q() {
        ImageView imageView;
        if (h() && this.f20607b0 && (imageView = this.i) != null) {
            n1.y yVar = this.f20603W;
            if (!this.f20627p0.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f20598R;
            Drawable drawable = this.f20588B;
            if (yVar == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (yVar.getShuffleModeEnabled()) {
                drawable = this.f20641y;
            }
            imageView.setImageDrawable(drawable);
            if (yVar.getShuffleModeEnabled()) {
                str = this.f20597Q;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.t.r():void");
    }

    public final void s() {
        p pVar = this.y0;
        pVar.getClass();
        List list = Collections.EMPTY_LIST;
        pVar.f20586b = list;
        h hVar = this.f20642z0;
        hVar.getClass();
        hVar.f20586b = list;
        n1.y yVar = this.f20603W;
        j(this.f20589B0, pVar.getItemCount() > 0);
    }

    public void setAnimationEnabled(boolean z4) {
        this.f20627p0.f20655C = z4;
    }

    public void setControlDispatcher(InterfaceC1896b interfaceC1896b) {
        if (this.f20605a0 != interfaceC1896b) {
            this.f20605a0 = interfaceC1896b;
            k();
        }
    }

    public void setOnFullScreenModeChangedListener(@Nullable j jVar) {
        boolean z4 = jVar != null;
        ImageView imageView = this.f20590C0;
        if (imageView != null) {
            if (z4) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z5 = jVar != null;
        ImageView imageView2 = this.f20591D0;
        if (imageView2 == null) {
            return;
        }
        if (z5) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(@Nullable InterfaceC1911q interfaceC1911q) {
    }

    public void setPlayer(@Nullable n1.y yVar) {
        Xh.i.f(Looper.myLooper() == Looper.getMainLooper());
        Xh.i.e(yVar == null || yVar.getApplicationLooper() == Looper.getMainLooper());
        n1.y yVar2 = this.f20603W;
        if (yVar2 == yVar) {
            return;
        }
        i iVar = this.f20604a;
        if (yVar2 != null) {
            yVar2.removeListener(iVar);
        }
        this.f20603W = yVar;
        if (yVar != null) {
            yVar.addListener(iVar);
        }
        if (yVar instanceof ExoPlayer) {
            v1.e trackSelector = ((ExoPlayer) yVar).getTrackSelector();
            if (trackSelector instanceof C2335b) {
                this.f20640x0 = (C2335b) trackSelector;
            }
        } else {
            this.f20640x0 = null;
        }
        i();
    }

    public void setProgressUpdateListener(@Nullable l lVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.f20615h0 = i;
        n1.y yVar = this.f20603W;
        if (yVar != null) {
            int repeatMode = yVar.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                InterfaceC1896b interfaceC1896b = this.f20605a0;
                n1.y yVar2 = this.f20603W;
                ((T2.g) interfaceC1896b).getClass();
                yVar2.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                InterfaceC1896b interfaceC1896b2 = this.f20605a0;
                n1.y yVar3 = this.f20603W;
                ((T2.g) interfaceC1896b2).getClass();
                yVar3.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                InterfaceC1896b interfaceC1896b3 = this.f20605a0;
                n1.y yVar4 = this.f20603W;
                ((T2.g) interfaceC1896b3).getClass();
                yVar4.setRepeatMode(2);
            }
        }
        this.f20627p0.i(this.h, i != 0);
        o();
    }

    public void setShowFastForwardButton(boolean z4) {
        this.f20627p0.i(this.f, z4);
        k();
    }

    public void setShowMultiWindowTimeBar(boolean z4) {
        this.f20608c0 = z4;
        r();
    }

    public void setShowNextButton(boolean z4) {
        this.f20627p0.i(this.f20609d, z4);
        k();
    }

    public void setShowPreviousButton(boolean z4) {
        this.f20627p0.i(this.c, z4);
        k();
    }

    public void setShowRewindButton(boolean z4) {
        this.f20627p0.i(this.f20613g, z4);
        k();
    }

    public void setShowShuffleButton(boolean z4) {
        this.f20627p0.i(this.i, z4);
        q();
    }

    public void setShowSubtitleButton(boolean z4) {
        this.f20627p0.i(this.f20589B0, z4);
    }

    public void setShowTimeoutMs(int i) {
        this.f20612f0 = i;
        if (g()) {
            this.f20627p0.h();
        }
    }

    public void setShowVrButton(boolean z4) {
        this.f20627p0.i(this.j, z4);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        int i4 = AbstractC2550e.f21351a;
        this.f20614g0 = Math.max(16, Math.min(i, 1000));
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            j(view, onClickListener != null);
        }
    }
}
