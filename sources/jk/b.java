package jk;

import A7.r;
import C2.f;
import Cg.c;
import D.S;
import G5.p;
import K3.d;
import Kh.I;
import Ng.AbstractC0493a;
import Ng.w;
import Ng.x;
import Ng.y;
import Ng.z;
import Q9.B;
import Tj.q;
import We.s;
import Y.e;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.CalendarContract;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.ImageViewCompat;
import b2.C0859a;
import b2.h;
import cj.C1112C;
import cj.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.E;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.ValidationField;
import com.paymaya.domain.model.ValidationRule;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import g4.C1499a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import ph.C2070f1;
import xj.InterfaceC2488d;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f17824a = new e(18);

    public static void A(Class cls, Application application) {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (activityInfo.name.equals(name)) {
                S.i(name.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        S.i(name.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    public static void B(Application application, String str) {
        for (ActivityInfo activityInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers) {
            if (activityInfo.name.equals(str)) {
                S.i(str.replaceFirst("com.clevertap.android.", "") + " is present");
                return;
            }
        }
        S.i(str.replaceFirst("com.clevertap.android.", "") + " not present");
    }

    public static void C(Application application, String str) {
        for (ServiceInfo serviceInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services) {
            if (serviceInfo.name.equals(str)) {
                S.i(str.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        S.i(str.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    public static final String a(Exception exc) {
        return String.format("EXTRACTING ERROR : %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
    }

    public static final void b(ImageView imageView, int i) {
        j.g(imageView, "<this>");
        Context context = imageView.getContext();
        j.f(context, "getContext(...)");
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(n(context, i)));
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final C1499a d(View clicks) {
        j.h(clicks, "$this$clicks");
        return new C1499a(clicks);
    }

    public static C0859a e(String str, String str2) {
        V2.a aVar = new V2.a(str, str2);
        d dVarB = C0859a.b(V2.a.class);
        dVarB.c = 1;
        dVarB.f = new p(aVar);
        return dVarB.d();
    }

    public static final c f(String str, Function0 createConfiguration, Function1 function1) {
        j.g(createConfiguration, "createConfiguration");
        return new c(str, createConfiguration, function1);
    }

    public static final w g(x parameters) {
        j.g(parameters, "parameters");
        y yVar = new y(0);
        for (String str : parameters.names()) {
            List listC = parameters.c(str);
            if (listC == null) {
                listC = C1112C.f9377a;
            }
            String strD = AbstractC0493a.d(0, 0, 15, str);
            List list = listC;
            ArrayList arrayList = new ArrayList(t.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0493a.d(0, 0, 11, (String) it.next()));
            }
            yVar.e(arrayList, strD);
        }
        Map values = (Map) yVar.f5552b;
        j.g(values, "values");
        return new z(values);
    }

    public static ArrayList h(List list, UpdateProfileFieldType field) {
        j.g(field, "field");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<ValidationField> validationFields = ((ValidationRule) obj).getValidationFields();
            Object obj2 = null;
            if (validationFields != null) {
                Iterator<T> it = validationFields.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (j.b(((ValidationField) next).getName(), field.getCmsName())) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (ValidationField) obj2;
            }
            if (obj2 != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static C0859a i(String str, f fVar) {
        d dVarB = C0859a.b(V2.a.class);
        dVarB.c = 1;
        dVarB.c(h.c(Context.class));
        dVarB.f = new r(19, str, fVar);
        return dVarB.d();
    }

    public static final InterfaceC2488d j(Rj.d dVar) {
        j.g(dVar, "<this>");
        if (dVar instanceof q) {
            return j(((q) dVar).f5884a);
        }
        return null;
    }

    public static final Long k(Context context) {
        Long lValueOf;
        ContentResolver contentResolver = context.getContentResolver();
        j.f(contentResolver, "getContentResolver(...)");
        Cursor cursorQuery = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id", "calendar_displayName"}, "(((isPrimary = 1) OR (account_name = ownerAccount)) AND (visible = 1) AND (calendar_access_level > ?))", new String[]{"600"}, "_id ASC");
        if (cursorQuery == null || !cursorQuery.moveToNext()) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(cursorQuery.getLong(0));
            cursorQuery.getString(1);
            yk.a.f();
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return lValueOf;
    }

    public static String l(CleverTapInstanceConfig cleverTapInstanceConfig) {
        return s.p(new StringBuilder(), cleverTapInstanceConfig != null ? cleverTapInstanceConfig.f9439a : "", "[Product Config]");
    }

    public static final Object m(Map map, Object obj, Boolean bool) {
        j.g(map, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            return map.getOrDefault(obj, bool);
        }
        if (!map.containsKey(obj)) {
            return bool;
        }
        Object obj2 = map.get(obj);
        j.d(obj2);
        return obj2;
    }

    public static final int n(Context context, int i) {
        j.g(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final Drawable o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return ContextCompat.getDrawable(context, typedValue.resourceId);
    }

    public static final String p(MayaInputLayout mayaInputLayout) {
        j.g(mayaInputLayout, "<this>");
        return String.valueOf(mayaInputLayout.getInputEditText().getText());
    }

    public static final Long q(Context context, Long l6, String str, String str2, long j, long j6) {
        String lastPathSegment;
        if (l6 == null) {
            yk.a.c();
            return null;
        }
        if (j >= j6) {
            yk.a.f21331b.getClass();
            C2070f1.l();
            j6 = 1 + j;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", l6);
        contentValues.put("title", str);
        contentValues.put("dtstart", Long.valueOf(j));
        contentValues.put("dtend", Long.valueOf(j6));
        contentValues.put("description", str2);
        contentValues.put("hasAlarm", (Integer) 1);
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        Uri uriInsert = context.getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues);
        if (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(lastPathSegment));
    }

    public static final Long r(Context context, Long l6) {
        String lastPathSegment;
        if (l6 == null) {
            yk.a.c();
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", l6);
        contentValues.put("minutes", (Integer) 60);
        contentValues.put(Constants.METHOD, (Integer) 1);
        Uri uriInsert = context.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
        if (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(lastPathSegment));
    }

    public static final void s(String str) {
        String string;
        if (F0.a.c) {
            if (str == null || (string = str.toString()) == null) {
                string = "null";
            }
            Log.i("flutter_image_compress", string);
        }
    }

    public static final void t(ConstraintLayout constraintLayout, SparseArray sparseArray) {
        Iterator it = ViewGroupKt.getChildren(constraintLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).restoreHierarchyState(sparseArray);
        }
    }

    public static final SparseArray u(ConstraintLayout constraintLayout) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Iterator it = ViewGroupKt.getChildren(constraintLayout).iterator();
        while (it.hasNext()) {
            ((View) it.next()).saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }

    public static void w(F7.c cVar, UserActivity userActivity) {
        G7.r rVar = ((MayaTransactionsFragment) cVar).f12205s0;
        if (rVar != null) {
            ((MayaTransactionsActivity) rVar).V1().Z(userActivity, null);
        }
    }

    public static void x(B b8, String str, List choices, String str2) {
        Boolean bool = Boolean.TRUE;
        NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) b8;
        newMayaCreditActivity.getClass();
        j.g(choices, "choices");
        E.a("NewMayaCreditActivity", "showChoiceBottomSheet");
        String strD = AbstractC1236z.d(newMayaCreditActivity, MayaChoicesBottomSheetDialogFragment.class);
        MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragmentI = I.i(str, choices, bool.booleanValue());
        mayaChoicesBottomSheetDialogFragmentI.f11830V = str2;
        mayaChoicesBottomSheetDialogFragmentI.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        mayaChoicesBottomSheetDialogFragmentI.f11835a0 = R.drawable.maya_bg_color_background_secondary_rounded;
    }

    public static String y(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i4 = AbstractC2550e.f21351a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void z(MayaInputLayout mayaInputLayout, boolean z4) {
        j.g(mayaInputLayout, "<this>");
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        int selectionStart = inputEditText.getSelectionStart();
        int selectionEnd = inputEditText.getSelectionEnd();
        boolean zHasFocus = inputEditText.hasFocus();
        inputEditText.setTransformationMethod(z4 ? null : new PasswordTransformationMethod());
        if (zHasFocus) {
            inputEditText.requestFocus();
            inputEditText.setSelection(selectionStart, selectionEnd);
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = inputEditText.getContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(z4 ? R.attr.mayaDrawable_RegistrationMaskPasswordShown : R.attr.mayaDrawable_RegistrationMaskPasswordHidden, typedValue, true);
        }
        Drawable drawable = ContextCompat.getDrawable(inputEditText.getContext(), typedValue.resourceId);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(inputEditText.getContext(), z4 ? R.drawable.maya_ic_mask_password_shown_light : R.drawable.maya_ic_mask_password_hidden_light);
        }
        mayaInputLayout.getPrimaryIconImageView().setImageDrawable(drawable);
    }

    public abstract void v(int i);
}
