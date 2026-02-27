package Z;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.dynatrace.android.callback.Callback;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6839b;
    public final CTInboxListViewFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CTInboxMessage f6840d;
    public final int e;
    public final ViewPager f;

    public l(int i, CTInboxMessage cTInboxMessage, String str, JSONObject jSONObject, CTInboxListViewFragment cTInboxListViewFragment, int i4) {
        this.e = i;
        this.f6840d = cTInboxMessage;
        this.f6839b = str;
        this.c = cTInboxListViewFragment;
        this.f6838a = jSONObject;
    }

    public final void a(FragmentActivity fragmentActivity) {
        ClipboardManager clipboardManager = (ClipboardManager) fragmentActivity.getSystemService("clipboard");
        ((CTInboxMessageContent) this.f6840d.j.get(0)).getClass();
        JSONObject jSONObject = this.f6838a;
        String string = "";
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.has("copyText") ? jSONObject.getJSONObject("copyText") : null;
                if (jSONObject2 != null && jSONObject2.has("text")) {
                    string = jSONObject2.getString("text");
                }
            } catch (JSONException e) {
                AbstractC1414e.t(e, new StringBuilder("Unable to get Link Text with JSON - "));
            }
        }
        ClipData clipDataNewPlainText = ClipData.newPlainText(this.f6839b, string);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(fragmentActivity, "Text Copied to Clipboard", 0).show();
        }
    }

    public final HashMap b(CTInboxMessage cTInboxMessage) {
        ArrayList arrayList;
        if (cTInboxMessage == null || (arrayList = cTInboxMessage.j) == null || arrayList.get(0) == null) {
            return null;
        }
        CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) arrayList.get(0);
        JSONObject jSONObject = this.f6838a;
        cTInboxMessageContent.getClass();
        if (!"kv".equalsIgnoreCase(CTInboxMessageContent.d(jSONObject))) {
            return null;
        }
        ((CTInboxMessageContent) arrayList.get(0)).getClass();
        if (jSONObject == null || !jSONObject.has("kv")) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("kv");
            Iterator<String> itKeys = jSONObject2.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject2.getString(next);
                if (!TextUtils.isEmpty(next)) {
                    map.put(next, string);
                }
            }
            if (map.isEmpty()) {
                return null;
            }
            return map;
        } catch (JSONException e) {
            AbstractC1414e.t(e, new StringBuilder("Unable to get Link Key Value with JSON - "));
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JSONObject jSONObject;
        CTInboxMessage cTInboxMessage = this.f6840d;
        Callback.onClick_enter(view);
        try {
            ViewPager viewPager = this.f;
            CTInboxListViewFragment cTInboxListViewFragment = this.c;
            int i = this.e;
            if (viewPager == null) {
                String str = this.f6839b;
                if (str == null || (jSONObject = this.f6838a) == null) {
                    if (cTInboxListViewFragment != null) {
                        cTInboxListViewFragment.n1(i, null, null, null);
                    }
                } else if (cTInboxListViewFragment != null) {
                    ((CTInboxMessageContent) cTInboxMessage.j.get(0)).getClass();
                    if (CTInboxMessageContent.d(jSONObject).equalsIgnoreCase("copy") && cTInboxListViewFragment.getActivity() != null) {
                        a(cTInboxListViewFragment.getActivity());
                    }
                    cTInboxListViewFragment.n1(i, str, this.f6838a, b(cTInboxMessage));
                }
            } else if (cTInboxListViewFragment != null) {
                cTInboxListViewFragment.o1(i, viewPager.getCurrentItem());
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    public l(int i, CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, ViewPager viewPager) {
        this.e = i;
        this.f6840d = cTInboxMessage;
        this.f6839b = null;
        this.c = cTInboxListViewFragment;
        this.f = viewPager;
    }
}
