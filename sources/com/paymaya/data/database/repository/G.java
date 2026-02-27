package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Fee;
import com.paymaya.domain.model.UserActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11299a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex3 = cursor.getColumnIndex(Constants.METHOD);
        int columnIndex4 = cursor.getColumnIndex("display");
        int columnIndex5 = cursor.getColumnIndex("status");
        int columnIndex6 = cursor.getColumnIndex("timestamp");
        int columnIndex7 = cursor.getColumnIndex("description_action");
        int columnIndex8 = cursor.getColumnIndex("description_target");
        int columnIndex9 = cursor.getColumnIndex("description_value");
        int columnIndex10 = cursor.getColumnIndex("description_currency");
        int columnIndex11 = cursor.getColumnIndex("fee_value");
        int columnIndex12 = cursor.getColumnIndex("fee_currency");
        int columnIndex13 = cursor.getColumnIndex("fee_label");
        int columnIndex14 = cursor.getColumnIndex("fee_display");
        ArrayList arrayList2 = arrayList;
        int columnIndex15 = cursor.getColumnIndex("status_display");
        while (true) {
            int i = columnIndex4;
            ActivityDescription activityDescriptionBuild = ActivityDescription.sBuilder().mAction(cursor.getString(columnIndex7)).mTarget(cursor.getString(columnIndex8)).build();
            int i4 = columnIndex7;
            Amount amountBuild = Amount.sBuilder().mValue(cursor.getString(columnIndex9)).mCurrency(cursor.getString(columnIndex10)).build();
            int i6 = columnIndex8;
            int i10 = columnIndex9;
            int i11 = columnIndex;
            UserActivity.Builder builderMDescription = UserActivity.sBuilder().mId(cursor.getString(columnIndex)).mType(cursor.getString(columnIndex2)).mMethod(cursor.getString(columnIndex3)).mStatus(cursor.getString(columnIndex5)).mTimestamp(cursor.getString(columnIndex6)).mDisplay(cursor.getString(i)).mAmount(amountBuild).mFee(Fee.sBuilder().mValue(cursor.getString(columnIndex11)).mCurrency(cursor.getString(columnIndex12)).mLabel(cursor.getString(columnIndex13)).mDisplay(cursor.getString(columnIndex14)).build()).mDescription(activityDescriptionBuild);
            int i12 = columnIndex15;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(builderMDescription.mStatusDisplay(cursor.getString(i12)).build());
            if (!cursor.moveToNext()) {
                cursor.close();
                return Collections.unmodifiableList(arrayList3);
            }
            columnIndex15 = i12;
            arrayList2 = arrayList3;
            columnIndex4 = i;
            columnIndex = i11;
            columnIndex7 = i4;
            columnIndex8 = i6;
            columnIndex9 = i10;
        }
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserActivity userActivity = (UserActivity) it.next();
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
            arrayList.add(contentValues);
        }
        this.f11299a.c("user_activity", Collections.unmodifiableList(arrayList));
    }
}
