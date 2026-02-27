package b0;

import D.InterfaceC0191y;
import D.b0;
import D.d0;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f8269b;

    public b(CleverTapInstanceConfig cleverTapInstanceConfig, g gVar, o0.c cVar) {
        this.f8269b = cleverTapInstanceConfig;
        e eVar = new e(gVar.c().split(","));
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoPrefIdentitySet [" + eVar + "]");
        e eVar2 = new e(cleverTapInstanceConfig.f9451t);
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoConfigIdentitySet [" + eVar2 + "]");
        HashSet hashSet = eVar.f8270a;
        boolean zIsEmpty = hashSet.isEmpty();
        HashSet hashSet2 = eVar2.f8270a;
        if (zIsEmpty || hashSet2.isEmpty() || eVar.equals(eVar2)) {
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoNo error found while comparing [Pref:" + eVar + "], [Config:" + eVar2 + "]");
        } else {
            cVar.b(o0.b.a(new String[0], 531, -1));
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepopushing error due to mismatch [Pref:" + eVar + "], [Config:" + eVar2 + "]");
        }
        if (!hashSet.isEmpty()) {
            this.f8268a = eVar;
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Pref[" + this.f8268a + "]");
        } else if (hashSet2.isEmpty()) {
            this.f8268a = new e(InterfaceC0191y.f959b);
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Default[" + this.f8268a + "]");
        } else {
            this.f8268a = eVar2;
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Config[" + this.f8268a + "]");
        }
        if (hashSet.isEmpty()) {
            String string = this.f8268a.toString();
            SharedPreferences.Editor editorEdit = b0.e(gVar.f8282b).edit();
            CleverTapInstanceConfig cleverTapInstanceConfig2 = gVar.f8281a;
            b0.i(editorEdit.putString(b0.n(cleverTapInstanceConfig2, "SP_KEY_PROFILE_IDENTITIES"), string));
            cleverTapInstanceConfig2.e("ON_USER_LOGIN", "saveIdentityKeysForAccount:" + string);
            cleverTapInstanceConfig.e("ON_USER_LOGIN", "ConfigurableIdentityRepoSaving Identity Keys in Pref[" + string + "]");
        }
    }

    @Override // b0.c
    public final boolean a(String str) {
        boolean zA = d0.a(str, this.f8268a.f8270a);
        this.f8269b.e("ON_USER_LOGIN", "ConfigurableIdentityRepoisIdentity [Key: " + str + " , Value: " + zA + "]");
        return zA;
    }

    @Override // b0.c
    public final e b() {
        return this.f8268a;
    }
}
