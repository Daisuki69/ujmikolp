package com.paymaya.domain.store;

import android.content.ContentValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.UserActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class X0 implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y0 f11406b;

    public /* synthetic */ X0(Y0 y0, int i) {
        this.f11405a = i;
        this.f11406b = y0;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f11405a) {
            case 0:
                List list = (List) obj;
                Y0 y0 = this.f11406b;
                y0.c.b(list);
                y0.a(list);
                break;
            case 1:
                UserActivity userActivity = (UserActivity) obj;
                com.paymaya.data.database.repository.G g8 = this.f11406b.c;
                g8.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put(TtmlNode.ATTR_ID, userActivity.mId());
                contentValues.put(SessionDescription.ATTR_TYPE, userActivity.mType());
                contentValues.put(Constants.METHOD, userActivity.mMethod());
                contentValues.put("status", userActivity.mStatus());
                contentValues.put("timestamp", userActivity.mTimestamp());
                contentValues.put("display", userActivity.mDisplay());
                contentValues.put("status_display", userActivity.mStatusDisplay());
                if (userActivity.mDescription() != null) {
                    contentValues.put("description_action", userActivity.mDescription().mAction());
                    contentValues.put("description_target", userActivity.mDescription().mTarget());
                }
                if (userActivity.mAmount() != null) {
                    contentValues.put("description_value", userActivity.mAmount().mValue());
                    contentValues.put("description_currency", userActivity.mAmount().mCurrency());
                }
                if (userActivity.mFee() != null) {
                    contentValues.put("fee_value", userActivity.mFee().mValue());
                    contentValues.put("fee_currency", userActivity.mFee().mCurrency());
                    contentValues.put("fee_label", userActivity.mFee().mLabel());
                    contentValues.put("fee_display", userActivity.mFee().mDisplay());
                }
                g8.f11299a.e("user_activity", contentValues, "id = ?", new String[]{userActivity.mId()});
                break;
            default:
                List list2 = (List) obj;
                Y0 y02 = this.f11406b;
                com.paymaya.data.database.repository.G g10 = y02.c;
                g10.f11299a.b("user_activity", "", null);
                g10.b(list2);
                y02.a(list2);
                break;
        }
    }
}
