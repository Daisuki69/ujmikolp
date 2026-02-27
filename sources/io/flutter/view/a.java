package io.flutter.view;

import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.dynatrace.android.agent.Global;
import d4.AbstractC1331a;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements AccessibilityChannel.AccessibilityMessageHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17399a;

    public a(l lVar) {
        this.f17399a = lVar;
    }

    @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
    public final void announce(String str) {
        this.f17399a.f17471a.announceForAccessibility(str);
    }

    @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
    public final void onFocus(int i) {
        this.f17399a.g(i, 8);
    }

    @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
    public final void onLongPress(int i) {
        this.f17399a.g(i, 2);
    }

    @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
    public final void onTap(int i) {
        this.f17399a.g(i, 1);
    }

    @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
    public final void onTooltip(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        l lVar = this.f17399a;
        AccessibilityEvent accessibilityEventD = lVar.d(0, 32);
        accessibilityEventD.getText().add(str);
        lVar.h(accessibilityEventD);
    }

    @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
    public final void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        l lVar = this.f17399a;
        lVar.getClass();
        while (byteBuffer.hasRemaining()) {
            f fVarB = lVar.b(byteBuffer.getInt());
            fVarB.c = byteBuffer.getInt();
            int i = byteBuffer.getInt();
            String str = null;
            fVarB.f17423d = i == -1 ? null : strArr[i];
            int i4 = byteBuffer.getInt();
            if (i4 != -1) {
                str = strArr[i4];
            }
            fVarB.e = str;
        }
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
    @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
    public final void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i;
        io.flutter.plugin.platform.u uVar;
        ArrayList arrayList;
        int i4;
        int i6;
        i iVar;
        int i10;
        int i11;
        i iVar2;
        String str;
        String str2;
        float f;
        float f3;
        View viewG;
        Integer num;
        WindowInsets rootWindowInsets;
        boolean z4;
        Activity activityH;
        int i12;
        l lVar;
        View viewG2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        l lVar2 = this.f17399a;
        lVar2.getClass();
        ArrayList<i> arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            i = 1;
            uVar = lVar2.e;
            if (!zHasRemaining) {
                break;
            }
            i iVarC = lVar2.c(byteBuffer.getInt());
            iVarC.f17426B = true;
            iVarC.f17432H = iVarC.f17459r;
            iVarC.f17433I = iVarC.f17457p;
            iVarC.f17427C = iVarC.c;
            iVarC.f17428D = iVarC.f17451d;
            iVarC.f17429E = iVarC.f17452g;
            iVarC.f17430F = iVarC.h;
            iVarC.f17431G = iVarC.f17454l;
            iVarC.c = byteBuffer.getInt();
            iVarC.f17451d = byteBuffer.getInt();
            iVarC.e = byteBuffer.getInt();
            iVarC.f = byteBuffer.getInt();
            iVarC.f17452g = byteBuffer.getInt();
            iVarC.h = byteBuffer.getInt();
            iVarC.i = byteBuffer.getInt();
            iVarC.j = byteBuffer.getInt();
            iVarC.f17453k = byteBuffer.getInt();
            iVarC.f17454l = byteBuffer.getFloat();
            iVarC.m = byteBuffer.getFloat();
            iVarC.f17455n = byteBuffer.getFloat();
            int i13 = byteBuffer.getInt();
            iVarC.f17456o = i13 == -1 ? null : strArr[i13];
            int i14 = byteBuffer.getInt();
            iVarC.f17457p = i14 == -1 ? null : strArr[i14];
            iVarC.f17458q = i.f(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            iVarC.f17459r = i15 == -1 ? null : strArr[i15];
            iVarC.f17460s = i.f(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            iVarC.f17461t = i16 == -1 ? null : strArr[i16];
            iVarC.f17462u = i.f(byteBuffer, byteBufferArr);
            int i17 = byteBuffer.getInt();
            iVarC.f17463v = i17 == -1 ? null : strArr[i17];
            iVarC.f17464w = i.f(byteBuffer, byteBufferArr);
            int i18 = byteBuffer.getInt();
            iVarC.f17465x = i18 == -1 ? null : strArr[i18];
            iVarC.f17466y = i.f(byteBuffer, byteBufferArr);
            int i19 = byteBuffer.getInt();
            iVarC.f17467z = i19 == -1 ? null : strArr[i19];
            byteBuffer.getInt();
            iVarC.J = byteBuffer.getFloat();
            iVarC.f17434K = byteBuffer.getFloat();
            iVarC.f17435L = byteBuffer.getFloat();
            iVarC.f17436M = byteBuffer.getFloat();
            if (iVarC.f17437N == null) {
                iVarC.f17437N = new float[16];
            }
            for (int i20 = 0; i20 < 16; i20++) {
                iVarC.f17437N[i20] = byteBuffer.getFloat();
            }
            iVarC.f17444U = true;
            iVarC.f17446W = true;
            int i21 = byteBuffer.getInt();
            ArrayList arrayList3 = iVarC.f17439P;
            arrayList3.clear();
            ArrayList arrayList4 = iVarC.f17440Q;
            arrayList4.clear();
            int i22 = 0;
            while (true) {
                lVar = iVarC.f17449a;
                if (i22 >= i21) {
                    break;
                }
                i iVarC2 = lVar.c(byteBuffer.getInt());
                iVarC2.f17438O = iVarC;
                arrayList3.add(iVarC2);
                i22++;
            }
            for (int i23 = 0; i23 < i21; i23++) {
                i iVarC3 = lVar.c(byteBuffer.getInt());
                iVarC3.f17438O = iVarC;
                arrayList4.add(iVarC3);
            }
            int i24 = byteBuffer.getInt();
            if (i24 == 0) {
                iVarC.f17441R = null;
            } else {
                ArrayList arrayList5 = iVarC.f17441R;
                if (arrayList5 == null) {
                    iVarC.f17441R = new ArrayList(i24);
                } else {
                    arrayList5.clear();
                }
                for (int i25 = 0; i25 < i24; i25++) {
                    f fVarB = lVar.b(byteBuffer.getInt());
                    int i26 = fVarB.c;
                    if (i26 == 1) {
                        iVarC.f17442S = fVarB;
                    } else if (i26 == 2) {
                        iVarC.f17443T = fVarB;
                    } else {
                        iVarC.f17441R.add(fVarB);
                    }
                    iVarC.f17441R.add(fVarB);
                }
            }
            if (!iVarC.g(14)) {
                if (iVarC.g(6)) {
                    lVar2.m = iVarC;
                }
                if (iVarC.f17426B) {
                    arrayList2.add(iVarC);
                }
                int i27 = iVarC.i;
                if (i27 != -1 && !uVar.l(i27) && (viewG2 = uVar.g(iVarC.i)) != null) {
                    viewG2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = lVar2.f17474g;
        i iVar3 = (i) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        FlutterView flutterView = lVar2.f17471a;
        if (iVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || !((activityH = E1.c.h(flutterView.getContext())) == null || activityH.getWindow() == null || !((i12 = activityH.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i12 == 0))) && (rootWindowInsets = flutterView.getRootWindowInsets()) != null) {
                if (!lVar2.f17481r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    iVar3.f17446W = true;
                    iVar3.f17444U = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                lVar2.f17481r = Integer.valueOf(systemWindowInsetLeft);
                z4 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            } else {
                z4 = false;
            }
            iVar3.k(fArr, hashSet, z4);
            iVar3.c(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        i iVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = lVar2.f17479p;
            if (!zHasNext) {
                break;
            }
            i iVar5 = (i) it.next();
            if (!arrayList.contains(Integer.valueOf(iVar5.f17450b))) {
                iVar4 = iVar5;
            }
        }
        if (iVar4 == null && arrayList6.size() > 0) {
            iVar4 = (i) androidx.camera.core.impl.a.b(1, arrayList6);
        }
        if (iVar4 != null && (iVar4.f17450b != lVar2.f17480q || arrayList6.size() != arrayList.size())) {
            lVar2.f17480q = iVar4.f17450b;
            String strE = iVar4.e();
            if (strE == null) {
                strE = Global.BLANK;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                flutterView.setAccessibilityPaneTitle(strE);
            } else {
                AccessibilityEvent accessibilityEventD = lVar2.d(iVar4.f17450b, 32);
                accessibilityEventD.getText().add(strE);
                lVar2.h(accessibilityEventD);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((i) it2.next()).f17450b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i4 = 4;
            if (!it3.hasNext()) {
                break;
            }
            i iVar6 = (i) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(iVar6)) {
                iVar6.f17438O = null;
                if (iVar6.i != -1 && (num = lVar2.j) != null && lVar2.f17473d.platformViewOfNode(num.intValue()) == uVar.g(iVar6.i)) {
                    lVar2.g(lVar2.j.intValue(), 65536);
                    lVar2.j = null;
                }
                int i28 = iVar6.i;
                if (i28 != -1 && (viewG = uVar.g(i28)) != null) {
                    viewG.setImportantForAccessibility(4);
                }
                i iVar7 = lVar2.i;
                if (iVar7 == iVar6) {
                    lVar2.g(iVar7.f17450b, 65536);
                    lVar2.i = null;
                }
                if (lVar2.m == iVar6) {
                    lVar2.m = null;
                }
                if (lVar2.f17478o == iVar6) {
                    lVar2.f17478o = null;
                }
                it3.remove();
            }
        }
        int i29 = 2048;
        AccessibilityEvent accessibilityEventD2 = lVar2.d(0, 2048);
        accessibilityEventD2.setContentChangeTypes(1);
        lVar2.h(accessibilityEventD2);
        for (i iVar8 : arrayList2) {
            if (!Float.isNaN(iVar8.f17454l) && !Float.isNaN(iVar8.f17431G) && iVar8.f17431G != iVar8.f17454l) {
                AccessibilityEvent accessibilityEventD3 = lVar2.d(iVar8.f17450b, 4096);
                float f7 = iVar8.f17454l;
                float f10 = iVar8.m;
                if (Float.isInfinite(f10)) {
                    if (f7 > 70000.0f) {
                        f7 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(iVar8.f17455n)) {
                    f = f10 + 100000.0f;
                    if (f7 < -70000.0f) {
                        f7 = -70000.0f;
                    }
                    f3 = f7 + 100000.0f;
                } else {
                    float f11 = iVar8.f17455n;
                    f = f10 - f11;
                    f3 = f7 - f11;
                }
                int i30 = iVar8.f17428D;
                if ((i30 & 16) != 0 || (i30 & 32) != 0) {
                    accessibilityEventD3.setScrollY((int) f3);
                    accessibilityEventD3.setMaxScrollY((int) f);
                } else if ((i30 & 4) != 0 || (i30 & 8) != 0) {
                    accessibilityEventD3.setScrollX((int) f3);
                    accessibilityEventD3.setMaxScrollX((int) f);
                }
                int i31 = iVar8.j;
                if (i31 > 0) {
                    accessibilityEventD3.setItemCount(i31);
                    accessibilityEventD3.setFromIndex(iVar8.f17453k);
                    Iterator it4 = iVar8.f17440Q.iterator();
                    int i32 = 0;
                    while (it4.hasNext()) {
                        if (!((i) it4.next()).g(14)) {
                            i32++;
                        }
                    }
                    accessibilityEventD3.setToIndex((iVar8.f17453k + i32) - i);
                }
                lVar2.h(accessibilityEventD3);
            }
            if (iVar8.g(16) && (((str = iVar8.f17457p) != null || iVar8.f17433I != null) && (str == null || (str2 = iVar8.f17433I) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventD4 = lVar2.d(iVar8.f17450b, i29);
                accessibilityEventD4.setContentChangeTypes(i);
                lVar2.h(accessibilityEventD4);
            }
            i iVar9 = lVar2.i;
            if (iVar9 != null && iVar9.f17450b == iVar8.f17450b && (iVar8.f17427C & AbstractC1331a.i(3)) == 0 && iVar8.g(3)) {
                AccessibilityEvent accessibilityEventD5 = lVar2.d(iVar8.f17450b, i4);
                accessibilityEventD5.getText().add(iVar8.f17457p);
                lVar2.h(accessibilityEventD5);
            }
            i iVar10 = lVar2.m;
            if (iVar10 != null && (i10 = iVar10.f17450b) == (i11 = iVar8.f17450b) && ((iVar2 = lVar2.f17477n) == null || iVar2.f17450b != i10)) {
                lVar2.f17477n = iVar10;
                lVar2.h(lVar2.d(i11, 8));
            } else if (iVar10 == null) {
                lVar2.f17477n = null;
            }
            i iVar11 = lVar2.m;
            if (iVar11 != null && iVar11.f17450b == iVar8.f17450b && (iVar8.f17427C & AbstractC1331a.i(5)) != 0 && iVar8.g(5) && ((iVar = lVar2.i) == null || iVar.f17450b == lVar2.m.f17450b)) {
                String str3 = iVar8.f17432H;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = iVar8.f17459r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventD6 = lVar2.d(iVar8.f17450b, 16);
                accessibilityEventD6.setBeforeText(str3);
                accessibilityEventD6.getText().add(str5);
                int i33 = 0;
                while (i33 < str3.length() && i33 < str5.length() && str3.charAt(i33) == str5.charAt(i33)) {
                    i33++;
                }
                if (i33 < str3.length() || i33 < str5.length()) {
                    accessibilityEventD6.setFromIndex(i33);
                    int length = str3.length() - i;
                    int length2 = str5.length() - i;
                    while (length >= i33 && length2 >= i33) {
                        i6 = i;
                        if (str3.charAt(length) != str5.charAt(length2)) {
                            break;
                        }
                        length--;
                        length2--;
                        i = i6;
                    }
                    i6 = i;
                    accessibilityEventD6.setRemovedCount((length - i33) + 1);
                    accessibilityEventD6.setAddedCount((length2 - i33) + 1);
                } else {
                    i6 = i;
                    accessibilityEventD6 = null;
                }
                if (accessibilityEventD6 != null) {
                    lVar2.h(accessibilityEventD6);
                }
                if (iVar8.f17429E != iVar8.f17452g || iVar8.f17430F != iVar8.h) {
                    AccessibilityEvent accessibilityEventD7 = lVar2.d(iVar8.f17450b, 8192);
                    accessibilityEventD7.getText().add(str5);
                    accessibilityEventD7.setFromIndex(iVar8.f17452g);
                    accessibilityEventD7.setToIndex(iVar8.h);
                    accessibilityEventD7.setItemCount(str5.length());
                    lVar2.h(accessibilityEventD7);
                }
            } else {
                i6 = i;
            }
            i = i6;
            i29 = 2048;
            i4 = 4;
        }
    }
}
