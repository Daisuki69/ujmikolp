package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import dOYHB6.lI6F16.x065T0;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f17470z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterView f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityChannel f17472b;
    public final AccessibilityManager c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f17473d;
    public final io.flutter.plugin.platform.u e;
    public final ContentResolver f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f17474g;
    public final HashMap h;
    public i i;
    public Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f17475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17476l;
    public i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f17477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f17478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f17479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f17481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f17482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f17485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f17486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f17487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f17488y;

    public l(FlutterView flutterView, AccessibilityChannel accessibilityChannel, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.u uVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(flutterView, 65536);
        this.f17474g = new HashMap();
        this.h = new HashMap();
        this.f17476l = 0;
        this.f17479p = new ArrayList();
        this.f17480q = 0;
        this.f17481r = 0;
        this.f17483t = false;
        this.f17484u = false;
        this.f17485v = new a(this);
        b bVar = new b(this);
        this.f17486w = bVar;
        c cVar = new c(this, new Handler());
        this.f17488y = cVar;
        this.f17471a = flutterView;
        this.f17472b = accessibilityChannel;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.f17473d = accessibilityViewEmbedder;
        this.e = uVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(this, accessibilityManager);
        this.f17487x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31 && flutterView.getResources() != null) {
            int i = flutterView.getResources().getConfiguration().fontWeightAdjustment;
            if (i == Integer.MAX_VALUE || i < 300) {
                this.f17476l &= -9;
            } else {
                this.f17476l |= 8;
            }
            accessibilityChannel.setAccessibilityFeatures(this.f17476l);
        }
        uVar.h.f17218a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AccessibilityNodeInfo createAccessibilityNodeInfo_impl(int i) {
        char c;
        boolean z4;
        String str;
        int i4;
        int i6;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f17473d;
        if (i >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i);
        }
        HashMap map = this.f17474g;
        View view = this.f17471a;
        if (i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            }
            return accessibilityNodeInfoObtain;
        }
        i iVar = (i) map.get(Integer.valueOf(i));
        if (iVar != null) {
            int i10 = iVar.i;
            io.flutter.plugin.platform.u uVar = this.e;
            if (i10 == -1 || !uVar.l(i10)) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 24) {
                    accessibilityNodeInfoObtain2.setImportantForAccessibility((iVar.g(12) || (i.b(iVar) == null && iVar.f17451d == 0)) ? false : true);
                }
                accessibilityNodeInfoObtain2.setViewIdResourceName("");
                String str2 = iVar.f17456o;
                if (str2 != null) {
                    accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
                }
                accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
                accessibilityNodeInfoObtain2.setClassName("android.view.View");
                accessibilityNodeInfoObtain2.setSource(view, i);
                accessibilityNodeInfoObtain2.setFocusable(iVar.i());
                i iVar2 = this.m;
                if (iVar2 != null) {
                    accessibilityNodeInfoObtain2.setFocused(iVar2.f17450b == i);
                }
                i iVar3 = this.i;
                if (iVar3 != null) {
                    accessibilityNodeInfoObtain2.setAccessibilityFocused(iVar3.f17450b == i);
                }
                if (iVar.g(5)) {
                    accessibilityNodeInfoObtain2.setPassword(iVar.g(11));
                    if (!iVar.g(21)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                    }
                    accessibilityNodeInfoObtain2.setEditable(!iVar.g(21));
                    int i12 = iVar.f17452g;
                    if (i12 != -1 && (i6 = iVar.h) != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(i12, i6);
                    }
                    i iVar4 = this.i;
                    if (iVar4 != null && iVar4.f17450b == i) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                    if (i.a(iVar, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (i.a(iVar, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i4 = 1;
                    }
                    if (i.a(iVar, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i4 |= 2;
                    }
                    if (i.a(iVar, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i4 |= 2;
                    }
                    accessibilityNodeInfoObtain2.setMovementGranularities(i4);
                    c = 0;
                    if (iVar.e >= 0) {
                        String str3 = iVar.f17459r;
                        accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - iVar.f) + iVar.e);
                        c = 0;
                    }
                } else {
                    c = 0;
                }
                if (i.a(iVar, e.SET_SELECTION)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (i.a(iVar, e.COPY)) {
                    accessibilityNodeInfoObtain2.addAction(16384);
                }
                if (i.a(iVar, e.CUT)) {
                    accessibilityNodeInfoObtain2.addAction(65536);
                }
                if (i.a(iVar, e.PASTE)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
                if (i.a(iVar, e.SET_TEXT)) {
                    accessibilityNodeInfoObtain2.addAction(2097152);
                }
                if (iVar.g(4) || iVar.g(23)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
                }
                if (iVar.g(15)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
                }
                if (i.a(iVar, e.DISMISS)) {
                    accessibilityNodeInfoObtain2.setDismissable(true);
                    accessibilityNodeInfoObtain2.addAction(1048576);
                }
                i iVar5 = iVar.f17438O;
                if (iVar5 != null) {
                    accessibilityNodeInfoObtain2.setParent(view, iVar5.f17450b);
                } else {
                    accessibilityNodeInfoObtain2.setParent(view);
                }
                int i13 = iVar.f17425A;
                if (i13 != -1) {
                    accessibilityNodeInfoObtain2.setTraversalAfter(view, i13);
                }
                Rect rect = iVar.f17448Y;
                i iVar6 = iVar.f17438O;
                if (iVar6 != null) {
                    Rect rect2 = iVar6.f17448Y;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
                } else {
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[c], iArr[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
                accessibilityNodeInfoObtain2.setVisibleToUser(true);
                accessibilityNodeInfoObtain2.setEnabled((!iVar.g(7) || iVar.g(8)) ? 1 : c);
                if (i.a(iVar, e.TAP)) {
                    if (iVar.f17442S != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iVar.f17442S.e));
                        accessibilityNodeInfoObtain2.setClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.setClickable(true);
                    }
                }
                if (i.a(iVar, e.LONG_PRESS)) {
                    if (iVar.f17443T != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, iVar.f17443T.e));
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(32);
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    }
                }
                e eVar = e.SCROLL_LEFT;
                boolean zA = i.a(iVar, eVar);
                e eVar2 = e.SCROLL_DOWN;
                e eVar3 = e.SCROLL_UP;
                e eVar4 = e.SCROLL_RIGHT;
                if (zA || i.a(iVar, eVar3) || i.a(iVar, eVar4) || i.a(iVar, eVar2)) {
                    accessibilityNodeInfoObtain2.setScrollable(true);
                    if (iVar.g(19)) {
                        if (i.a(iVar, eVar) || i.a(iVar, eVar4)) {
                            boolean z5 = c;
                            if (j(iVar)) {
                                accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(z5 ? 1 : 0, iVar.j, z5));
                            } else {
                                accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                            }
                        } else if (j(iVar)) {
                            boolean z8 = c;
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iVar.j, z8 ? 1 : 0, z8));
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                    if (i.a(iVar, eVar) || i.a(iVar, eVar3)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (i.a(iVar, eVar4) || i.a(iVar, eVar2)) {
                        accessibilityNodeInfoObtain2.addAction(8192);
                    }
                }
                e eVar5 = e.INCREASE;
                boolean zA2 = i.a(iVar, eVar5);
                e eVar6 = e.DECREASE;
                if (zA2 || i.a(iVar, eVar6)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                    if (i.a(iVar, eVar5)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (i.a(iVar, eVar6)) {
                        accessibilityNodeInfoObtain2.addAction(8192);
                    }
                }
                if (iVar.g(16)) {
                    accessibilityNodeInfoObtain2.setLiveRegion(1);
                }
                if (iVar.g(5)) {
                    accessibilityNodeInfoObtain2.setText(i.d(iVar.f17459r, iVar.f17460s));
                    if (i11 >= 28) {
                        CharSequence[] charSequenceArr = {i.d(iVar.f17457p, iVar.f17458q), i.d(iVar.f17465x, iVar.f17466y)};
                        int i14 = 0;
                        CharSequence charSequence = null;
                        for (int i15 = 2; i14 < i15; i15 = 2) {
                            CharSequence charSequenceConcat = charSequenceArr[i14];
                            if (charSequenceConcat != null && charSequenceConcat.length() > 0) {
                                if (charSequence != null && charSequence.length() != 0) {
                                    charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                                }
                                charSequence = charSequenceConcat;
                            }
                            i14++;
                        }
                        z4 = false;
                        accessibilityNodeInfoObtain2.setHintText(charSequence);
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                    if (!iVar.g(12)) {
                        CharSequence charSequenceB = i.b(iVar);
                        if (i11 < 28 && iVar.f17467z != null) {
                            charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + Global.NEWLINE + iVar.f17467z;
                        }
                        if (charSequenceB != null) {
                            accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                        }
                    }
                }
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 28 && (str = iVar.f17467z) != null) {
                    accessibilityNodeInfoObtain2.setTooltipText(str);
                }
                boolean z9 = true;
                boolean zG = iVar.g(1);
                boolean zG2 = iVar.g(17);
                if (!zG && !zG2) {
                    z9 = z4;
                }
                accessibilityNodeInfoObtain2.setCheckable(z9);
                if (zG) {
                    accessibilityNodeInfoObtain2.setChecked(iVar.g(2));
                    if (iVar.g(9)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (zG2) {
                    accessibilityNodeInfoObtain2.setChecked(iVar.g(18));
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                }
                accessibilityNodeInfoObtain2.setSelected(iVar.g(3));
                if (i16 >= 28) {
                    accessibilityNodeInfoObtain2.setHeading(iVar.g(10));
                }
                i iVar7 = this.i;
                if (iVar7 == null || iVar7.f17450b != i) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(128);
                }
                ArrayList<f> arrayList = iVar.f17441R;
                if (arrayList != null) {
                    for (f fVar : arrayList) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f17421a, fVar.f17423d));
                    }
                }
                for (i iVar8 : iVar.f17439P) {
                    if (!iVar8.g(14)) {
                        int i17 = iVar8.i;
                        if (i17 != -1) {
                            View viewG = uVar.g(i17);
                            if (!uVar.l(iVar8.i)) {
                                accessibilityNodeInfoObtain2.addChild(viewG);
                            }
                        }
                        accessibilityNodeInfoObtain2.addChild(view, iVar8.f17450b);
                    }
                }
                return accessibilityNodeInfoObtain2;
            }
            View viewG2 = uVar.g(iVar.i);
            if (viewG2 != null) {
                return accessibilityViewEmbedder.getRootNode(viewG2, iVar.f17450b, iVar.f17448Y);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final boolean performAction_impl(int i, int i4, Bundle bundle) {
        if (i >= 65536) {
            boolean zPerformAction = this.f17473d.performAction(i, i4, bundle);
            if (zPerformAction && i4 == 128) {
                this.j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f17474g;
        i iVar = (i) map.get(Integer.valueOf(i));
        if (iVar != null) {
            e eVar = e.INCREASE;
            e eVar2 = e.DECREASE;
            AccessibilityChannel accessibilityChannel = this.f17472b;
            switch (i4) {
                case 16:
                    accessibilityChannel.dispatchSemanticsAction(i, e.TAP);
                    return true;
                case 32:
                    accessibilityChannel.dispatchSemanticsAction(i, e.LONG_PRESS);
                    return true;
                case 64:
                    if (this.i == null) {
                        this.f17471a.invalidate();
                    }
                    this.i = iVar;
                    accessibilityChannel.dispatchSemanticsAction(i, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap map2 = new HashMap();
                    map2.put(SessionDescription.ATTR_TYPE, "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(iVar.f17450b));
                    accessibilityChannel.channel.a(map2, null);
                    g(i, 32768);
                    if (!i.a(iVar, eVar) && !i.a(iVar, eVar2)) {
                        return true;
                    }
                    g(i, 4);
                    return true;
                case 128:
                    i iVar2 = this.i;
                    if (iVar2 != null && iVar2.f17450b == i) {
                        this.i = null;
                    }
                    Integer num = this.j;
                    if (num != null && num.intValue() == i) {
                        this.j = null;
                    }
                    accessibilityChannel.dispatchSemanticsAction(i, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i, 65536);
                    return true;
                case 256:
                    return f(iVar, i, bundle, true);
                case 512:
                    return f(iVar, i, bundle, false);
                case 4096:
                    e eVar3 = e.SCROLL_UP;
                    if (i.a(iVar, eVar3)) {
                        accessibilityChannel.dispatchSemanticsAction(i, eVar3);
                        return true;
                    }
                    e eVar4 = e.SCROLL_LEFT;
                    if (i.a(iVar, eVar4)) {
                        accessibilityChannel.dispatchSemanticsAction(i, eVar4);
                        return true;
                    }
                    if (i.a(iVar, eVar)) {
                        iVar.f17459r = iVar.f17461t;
                        iVar.f17460s = iVar.f17462u;
                        g(i, 4);
                        accessibilityChannel.dispatchSemanticsAction(i, eVar);
                        return true;
                    }
                    break;
                case 8192:
                    e eVar5 = e.SCROLL_DOWN;
                    if (i.a(iVar, eVar5)) {
                        accessibilityChannel.dispatchSemanticsAction(i, eVar5);
                        return true;
                    }
                    e eVar6 = e.SCROLL_RIGHT;
                    if (i.a(iVar, eVar6)) {
                        accessibilityChannel.dispatchSemanticsAction(i, eVar6);
                        return true;
                    }
                    if (i.a(iVar, eVar2)) {
                        iVar.f17459r = iVar.f17463v;
                        iVar.f17460s = iVar.f17464w;
                        g(i, 4);
                        accessibilityChannel.dispatchSemanticsAction(i, eVar2);
                        return true;
                    }
                    break;
                case 16384:
                    accessibilityChannel.dispatchSemanticsAction(i, e.COPY);
                    return true;
                case 32768:
                    accessibilityChannel.dispatchSemanticsAction(i, e.PASTE);
                    return true;
                case 65536:
                    accessibilityChannel.dispatchSemanticsAction(i, e.CUT);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put(TtmlNode.RUBY_BASE, Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put(TtmlNode.ATTR_TTS_EXTENT, Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put(TtmlNode.RUBY_BASE, Integer.valueOf(iVar.h));
                        map3.put(TtmlNode.ATTR_TTS_EXTENT, Integer.valueOf(iVar.h));
                    }
                    accessibilityChannel.dispatchSemanticsAction(i, e.SET_SELECTION, map3);
                    i iVar3 = (i) map.get(Integer.valueOf(i));
                    iVar3.f17452g = ((Integer) map3.get(TtmlNode.RUBY_BASE)).intValue();
                    iVar3.h = ((Integer) map3.get(TtmlNode.ATTR_TTS_EXTENT)).intValue();
                    return true;
                case 1048576:
                    accessibilityChannel.dispatchSemanticsAction(i, e.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    accessibilityChannel.dispatchSemanticsAction(i, e.SET_TEXT, string);
                    iVar.f17459r = string;
                    iVar.f17460s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    accessibilityChannel.dispatchSemanticsAction(i, e.SHOW_ON_SCREEN);
                    return true;
                default:
                    f fVar = (f) this.h.get(Integer.valueOf(i4 - 267386881));
                    if (fVar != null) {
                        accessibilityChannel.dispatchSemanticsAction(i, e.CUSTOM_ACTION, Integer.valueOf(fVar.f17422b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f17473d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f17475k = recordFlutterId;
            this.m = null;
            return true;
        }
        if (eventType == 128) {
            this.f17478o = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f17475k = null;
        this.j = null;
        return true;
    }

    public final f b(int i) {
        HashMap map = this.h;
        f fVar = (f) map.get(Integer.valueOf(i));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.c = -1;
        fVar2.f17422b = i;
        fVar2.f17421a = 267386881 + i;
        map.put(Integer.valueOf(i), fVar2);
        return fVar2;
    }

    public final i c(int i) {
        HashMap map = this.f17474g;
        i iVar = (i) map.get(Integer.valueOf(i));
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        iVar2.f17450b = i;
        map.put(Integer.valueOf(i), iVar2);
        return iVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo orig_node_info = createAccessibilityNodeInfo_impl(i);
        x065T0.qmpzM4(this, orig_node_info, i);
        return orig_node_info;
    }

    public final AccessibilityEvent d(int i, int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        FlutterView flutterView = this.f17471a;
        accessibilityEventObtain.setPackageName(flutterView.getContext().getPackageName());
        accessibilityEventObtain.setSource(flutterView, i);
        return accessibilityEventObtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z4) {
        i iVarH;
        if (this.c.isTouchExplorationEnabled()) {
            HashMap map = this.f17474g;
            if (!map.isEmpty()) {
                i iVarH2 = ((i) map.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
                if (iVarH2 == null || iVarH2.i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x6 = motionEvent.getX();
                        float y7 = motionEvent.getY();
                        if (!map.isEmpty() && (iVarH = ((i) map.get(0)).h(new float[]{x6, y7, 0.0f, 1.0f}, z4)) != this.f17478o) {
                            if (iVarH != null) {
                                g(iVarH.f17450b, 128);
                            }
                            i iVar = this.f17478o;
                            if (iVar != null) {
                                g(iVar.f17450b, 256);
                            }
                            this.f17478o = iVarH;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        i iVar2 = this.f17478o;
                        if (iVar2 != null) {
                            g(iVar2.f17450b, 256);
                            this.f17478o = null;
                        }
                    }
                    return true;
                }
                if (!z4) {
                    return this.f17473d.onAccessibilityHoverEvent(iVarH2.f17450b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(i iVar, int i, Bundle bundle, boolean z4) {
        int i4;
        int i6 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = iVar.f17452g;
        int i11 = iVar.h;
        if (i11 >= 0 && i10 >= 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8 || i6 == 16) {
                            if (z4) {
                                iVar.h = iVar.f17459r.length();
                            } else {
                                iVar.h = 0;
                            }
                        }
                    } else if (z4 && i11 < iVar.f17459r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(iVar.f17459r.substring(iVar.h));
                        if (matcher.find()) {
                            iVar.h += matcher.start(1);
                        } else {
                            iVar.h = iVar.f17459r.length();
                        }
                    } else if (!z4 && iVar.h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(iVar.f17459r.substring(0, iVar.h));
                        if (matcher2.find()) {
                            iVar.h = matcher2.start(1);
                        } else {
                            iVar.h = 0;
                        }
                    }
                } else if (z4 && i11 < iVar.f17459r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(iVar.f17459r.substring(iVar.h));
                    matcher3.find();
                    if (matcher3.find()) {
                        iVar.h += matcher3.start(1);
                    } else {
                        iVar.h = iVar.f17459r.length();
                    }
                } else if (!z4 && iVar.h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(iVar.f17459r.substring(0, iVar.h));
                    if (matcher4.find()) {
                        iVar.h = matcher4.start(1);
                    }
                }
            } else if (z4 && i11 < iVar.f17459r.length()) {
                iVar.h++;
            } else if (!z4 && (i4 = iVar.h) > 0) {
                iVar.h = i4 - 1;
            }
            if (!z5) {
                iVar.f17452g = iVar.h;
            }
        }
        if (i10 != iVar.f17452g || i11 != iVar.h) {
            String str = iVar.f17459r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventD = d(iVar.f17450b, 8192);
            accessibilityEventD.getText().add(str);
            accessibilityEventD.setFromIndex(iVar.f17452g);
            accessibilityEventD.setToIndex(iVar.h);
            accessibilityEventD.setItemCount(str.length());
            h(accessibilityEventD);
        }
        AccessibilityChannel accessibilityChannel = this.f17472b;
        if (i6 == 1) {
            if (z4) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (i.a(iVar, eVar)) {
                    accessibilityChannel.dispatchSemanticsAction(i, eVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (i.a(iVar, eVar2)) {
                    accessibilityChannel.dispatchSemanticsAction(i, eVar2, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 2) {
            if (z4) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (i.a(iVar, eVar3)) {
                    accessibilityChannel.dispatchSemanticsAction(i, eVar3, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (!z4) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (i.a(iVar, eVar4)) {
                    accessibilityChannel.dispatchSemanticsAction(i, eVar4, Boolean.valueOf(z5));
                    return true;
                }
            }
        } else if (i6 == 4 || i6 == 8 || i6 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            i iVar = this.m;
            if (iVar != null) {
                return createAccessibilityNodeInfo(iVar.f17450b);
            }
            Integer num = this.f17475k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i != 2) {
            return null;
        }
        i iVar2 = this.i;
        if (iVar2 != null) {
            return createAccessibilityNodeInfo(iVar2.f17450b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i, int i4) {
        if (this.c.isEnabled()) {
            h(d(i, i4));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            View view = this.f17471a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z4) {
        if (this.f17483t == z4) {
            return;
        }
        this.f17483t = z4;
        if (z4) {
            this.f17476l |= 1;
        } else {
            this.f17476l &= -2;
        }
        this.f17472b.setAccessibilityFeatures(this.f17476l);
    }

    public final boolean j(i iVar) {
        if (iVar.j <= 0) {
            return false;
        }
        i iVar2 = this.i;
        i iVar3 = null;
        if (iVar2 != null) {
            i iVar4 = iVar2.f17438O;
            while (true) {
                if (iVar4 == null) {
                    iVar4 = null;
                    break;
                }
                if (iVar4 == iVar) {
                    break;
                }
                iVar4 = iVar4.f17438O;
            }
            if (iVar4 != null) {
                return true;
            }
        }
        i iVar5 = this.i;
        if (iVar5 == null) {
            return true;
        }
        i iVar6 = iVar5.f17438O;
        while (true) {
            if (iVar6 == null) {
                break;
            }
            if (iVar6.g(19)) {
                iVar3 = iVar6;
                break;
            }
            iVar6 = iVar6.f17438O;
        }
        return iVar3 == null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i4, Bundle bundle) {
        if (x065T0.cHOjy0(this, i, i4, bundle)) {
            return performAction_impl(i, i4, bundle);
        }
        return false;
    }
}
