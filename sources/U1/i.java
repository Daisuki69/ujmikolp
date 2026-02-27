package U1;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5912b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5913d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5914g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f5912b = str;
        this.f5911a = str2;
        this.c = str3;
        this.f5913d = str4;
        this.e = str5;
        this.f = str6;
        this.f5914g = str7;
    }

    public static i a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equal(this.f5912b, iVar.f5912b) && Objects.equal(this.f5911a, iVar.f5911a) && Objects.equal(this.c, iVar.c) && Objects.equal(this.f5913d, iVar.f5913d) && Objects.equal(this.e, iVar.e) && Objects.equal(this.f, iVar.f) && Objects.equal(this.f5914g, iVar.f5914g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5912b, this.f5911a, this.c, this.f5913d, this.e, this.f, this.f5914g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f5912b).add("apiKey", this.f5911a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.f5914g).toString();
    }
}
