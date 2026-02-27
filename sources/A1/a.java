package A1;

import D.S;
import Z.t;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.h;
import android.support.v4.media.i;
import android.support.v4.os.ResultReceiver;
import b.C0843a;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.MothersMaidenName;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.Stop;
import com.paymaya.mayaui.favorite.model.FavoriteCategory;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.utilities.ImageUrl;
import com.paymaya.utilities.ImageUrlIOS;
import com.paymaya.utilities.ImageUrlUnfiltered;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19a;

    public /* synthetic */ a(int i) {
        this.f19a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        Bundle bundle;
        ArrayList arrayList;
        JSONObject jSONObject2 = null;
        ArrayList arrayList2 = null;
        Bundle bundleCreateBundle = null;
        b.b bVar = null;
        JSONArray jSONArray = null;
        JSONObject jSONObject3 = null;
        JSONObject jSONObject4 = null;
        switch (this.f19a) {
            case 0:
                return new ColorInfo(parcel);
            case 1:
                CleverTapDisplayUnit cleverTapDisplayUnit = new CleverTapDisplayUnit();
                try {
                    cleverTapDisplayUnit.f9462g = parcel.readString();
                    cleverTapDisplayUnit.f = (I.a) parcel.readValue(I.a.class.getClassLoader());
                    cleverTapDisplayUnit.f9459a = parcel.readString();
                    if (parcel.readByte() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        cleverTapDisplayUnit.f9460b = arrayList3;
                        parcel.readList(arrayList3, CleverTapDisplayUnitContent.class.getClassLoader());
                    } else {
                        cleverTapDisplayUnit.f9460b = null;
                    }
                    cleverTapDisplayUnit.c = parcel.readHashMap(null);
                    if (parcel.readByte() != 0) {
                        jSONObject2 = new JSONObject(parcel.readString());
                    }
                    cleverTapDisplayUnit.e = jSONObject2;
                    cleverTapDisplayUnit.f9461d = parcel.readString();
                    break;
                } catch (Exception e) {
                    String str = "Error Creating Display Unit from parcel : " + e.getLocalizedMessage();
                    cleverTapDisplayUnit.f9461d = str;
                    S.c("DisplayUnit : ", str);
                }
                return cleverTapDisplayUnit;
            case 2:
                CleverTapDisplayUnitContent cleverTapDisplayUnitContent = new CleverTapDisplayUnitContent();
                cleverTapDisplayUnitContent.i = parcel.readString();
                cleverTapDisplayUnitContent.j = parcel.readString();
                cleverTapDisplayUnitContent.f = parcel.readString();
                cleverTapDisplayUnitContent.f9466g = parcel.readString();
                cleverTapDisplayUnitContent.f9465d = parcel.readString();
                cleverTapDisplayUnitContent.e = parcel.readString();
                cleverTapDisplayUnitContent.f9464b = parcel.readString();
                cleverTapDisplayUnitContent.h = parcel.readString();
                cleverTapDisplayUnitContent.f9463a = parcel.readString();
                cleverTapDisplayUnitContent.c = parcel.readString();
                return cleverTapDisplayUnitContent;
            case 3:
                j.g(parcel, "parcel");
                return new CreditReviewUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), J9.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (J9.a) parcel.readSerializable(), parcel.readInt() == 0 ? null : CreditTerm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? MothersMaidenName.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0);
            case 4:
                j.g(parcel, "parcel");
                return new ImageUrl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                j.g(parcel, "parcel");
                return new ImageUrlIOS(parcel.readString(), parcel.readString());
            case 6:
                j.g(parcel, "parcel");
                return new ImageUrlUnfiltered(parcel.readInt() == 0 ? null : ImageUrl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageUrlIOS.CREATOR.createFromParcel(parcel) : null);
            case 7:
                j.g(parcel, "in");
                CTInAppNotification cTInAppNotification = new CTInAppNotification();
                cTInAppNotification.i = new ArrayList();
                cTInAppNotification.f9505v = "#FFFFFF";
                cTInAppNotification.f9478R = -1.0d;
                cTInAppNotification.f9483W = new ArrayList();
                cTInAppNotification.f9484X = "#000000";
                cTInAppNotification.f9488a0 = "#000000";
                cTInAppNotification.f9487a = parcel.readString();
                cTInAppNotification.f9489b = parcel.readString();
                Object value = parcel.readValue(N.c.class.getClassLoader());
                cTInAppNotification.c = value instanceof N.c ? (N.c) value : null;
                cTInAppNotification.f9480T = parcel.readString();
                cTInAppNotification.f9492d = parcel.readByte() != 0;
                cTInAppNotification.f9486Z = parcel.readByte() != 0;
                cTInAppNotification.f9474B = parcel.readByte() != 0;
                cTInAppNotification.h = parcel.readInt();
                cTInAppNotification.f9499p = parcel.readInt();
                cTInAppNotification.f9498o = parcel.readInt();
                cTInAppNotification.f9485Y = (char) parcel.readInt();
                cTInAppNotification.f9476P = parcel.readInt();
                cTInAppNotification.f9477Q = parcel.readInt();
                cTInAppNotification.f9491c0 = parcel.readInt();
                cTInAppNotification.f9493d0 = parcel.readInt();
                String string = parcel.readString();
                String str2 = WeJson.EMPTY_MAP;
                if (string == null) {
                    string = WeJson.EMPTY_MAP;
                }
                cTInAppNotification.f = new JSONObject(string);
                cTInAppNotification.f9475K = parcel.readString();
                if (parcel.readByte() == 0) {
                    jSONObject = null;
                } else {
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        string2 = WeJson.EMPTY_MAP;
                    }
                    jSONObject = new JSONObject(string2);
                }
                cTInAppNotification.f9507x = jSONObject;
                if (parcel.readByte() != 0) {
                    String string3 = parcel.readString();
                    if (string3 != null) {
                        str2 = string3;
                    }
                    jSONObject4 = new JSONObject(str2);
                }
                cTInAppNotification.e = jSONObject4;
                cTInAppNotification.f9504u = parcel.readString();
                cTInAppNotification.f9496l = parcel.readString();
                String string4 = parcel.readString();
                if (string4 == null) {
                    string4 = cTInAppNotification.f9488a0;
                }
                cTInAppNotification.f9488a0 = string4;
                String string5 = parcel.readString();
                if (string5 == null) {
                    string5 = cTInAppNotification.f9505v;
                }
                cTInAppNotification.f9505v = string5;
                cTInAppNotification.m = parcel.readString();
                String string6 = parcel.readString();
                if (string6 == null) {
                    string6 = cTInAppNotification.f9484X;
                }
                cTInAppNotification.f9484X = string6;
                try {
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(CTInAppNotificationButton.CREATOR);
                    if (arrayListCreateTypedArrayList == null) {
                        arrayListCreateTypedArrayList = new ArrayList();
                    }
                    cTInAppNotification.i = arrayListCreateTypedArrayList;
                    break;
                } catch (Throwable unused) {
                }
                try {
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CTInAppNotificationMedia.CREATOR);
                    if (arrayListCreateTypedArrayList2 == null) {
                        arrayListCreateTypedArrayList2 = new ArrayList();
                    }
                    cTInAppNotification.f9483W = arrayListCreateTypedArrayList2;
                    break;
                } catch (Throwable unused2) {
                }
                cTInAppNotification.f9479S = parcel.readByte() != 0;
                cTInAppNotification.f9506w = parcel.readInt();
                cTInAppNotification.f9481U = parcel.readByte() != 0;
                cTInAppNotification.f9508y = parcel.readString();
                cTInAppNotification.f9482V = parcel.readByte() != 0;
                cTInAppNotification.f9495k = parcel.readByte() != 0;
                cTInAppNotification.j = parcel.readByte() != 0;
                cTInAppNotification.f9500q = parcel.readByte() != 0;
                cTInAppNotification.f9501r = parcel.readByte() != 0;
                cTInAppNotification.f9494g = parcel.readString();
                cTInAppNotification.f9497n = parcel.readLong();
                cTInAppNotification.f9503t = (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader());
                cTInAppNotification.f9478R = parcel.readDouble();
                cTInAppNotification.f9502s = parcel.readByte() != 0;
                return cTInAppNotification;
            case 8:
                j.g(parcel, "parcel");
                return new CTInAppNotificationButton(parcel);
            case 9:
                j.g(parcel, "parcel");
                return new CTInAppNotificationMedia(parcel);
            case 10:
                return new Counter(parcel);
            case 11:
                return new Trace(parcel, false);
            case 12:
                return new PerfSession(parcel);
            case 13:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 14:
                j.g(parcel, "parcel");
                return new FavoriteCategory(parcel.readString(), parcel.readString());
            case 15:
                CTInboxMessage cTInboxMessage = new CTInboxMessage();
                cTInboxMessage.e = new JSONObject();
                cTInboxMessage.j = new ArrayList();
                cTInboxMessage.f9562n = new ArrayList();
                try {
                    cTInboxMessage.f9563o = parcel.readString();
                    cTInboxMessage.c = parcel.readString();
                    cTInboxMessage.i = parcel.readString();
                    cTInboxMessage.f9556a = parcel.readString();
                    cTInboxMessage.f9559g = parcel.readLong();
                    cTInboxMessage.h = parcel.readLong();
                    cTInboxMessage.f9561l = parcel.readString();
                    cTInboxMessage.f = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
                    cTInboxMessage.e = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
                    cTInboxMessage.f9560k = parcel.readByte() != 0;
                    cTInboxMessage.f9564p = (t) parcel.readValue(t.class.getClassLoader());
                    if (parcel.readByte() == 1) {
                        ArrayList arrayList4 = new ArrayList();
                        cTInboxMessage.f9562n = arrayList4;
                        parcel.readList(arrayList4, String.class.getClassLoader());
                    } else {
                        cTInboxMessage.f9562n = null;
                    }
                    cTInboxMessage.f9557b = parcel.readString();
                    if (parcel.readByte() == 1) {
                        ArrayList arrayList5 = new ArrayList();
                        cTInboxMessage.j = arrayList5;
                        parcel.readList(arrayList5, CTInboxMessageContent.class.getClassLoader());
                    } else {
                        cTInboxMessage.j = null;
                    }
                    cTInboxMessage.m = parcel.readString();
                    cTInboxMessage.f9558d = parcel.readString();
                    if (parcel.readByte() != 0) {
                        jSONObject3 = new JSONObject(parcel.readString());
                    }
                    cTInboxMessage.f9565q = jSONObject3;
                    break;
                } catch (JSONException e7) {
                    AbstractC1414e.t(e7, new StringBuilder("Unable to parse CTInboxMessage from parcel - "));
                }
                return cTInboxMessage;
            case 16:
                CTInboxMessageContent cTInboxMessageContent = new CTInboxMessageContent();
                cTInboxMessageContent.m = parcel.readString();
                cTInboxMessageContent.f9572n = parcel.readString();
                cTInboxMessageContent.j = parcel.readString();
                cTInboxMessageContent.f9570k = parcel.readString();
                cTInboxMessageContent.h = parcel.readString();
                cTInboxMessageContent.i = parcel.readString();
                cTInboxMessageContent.f9568d = Boolean.valueOf(parcel.readByte() != 0);
                cTInboxMessageContent.c = Boolean.valueOf(parcel.readByte() != 0);
                cTInboxMessageContent.f9566a = parcel.readString();
                cTInboxMessageContent.e = parcel.readString();
                cTInboxMessageContent.f = parcel.readString();
                try {
                    if (parcel.readByte() != 0) {
                        jSONArray = new JSONArray(parcel.readString());
                    }
                    cTInboxMessageContent.f9569g = jSONArray;
                    break;
                } catch (JSONException e10) {
                    AbstractC1414e.t(e10, new StringBuilder("Unable to init CTInboxMessageContent with Parcel - "));
                }
                cTInboxMessageContent.f9567b = parcel.readString();
                cTInboxMessageContent.f9571l = parcel.readString();
                return cTInboxMessageContent;
            case 17:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 18:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = h.g(mediaDescription);
                CharSequence charSequenceI = h.i(mediaDescription);
                CharSequence charSequenceH = h.h(mediaDescription);
                CharSequence charSequenceC = h.c(mediaDescription);
                Bitmap bitmapE = h.e(mediaDescription);
                Uri uriF = h.f(mediaDescription);
                Bundle bundleD = h.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.h.b(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = i.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.i = mediaDescription;
                return mediaDescriptionCompat;
            case 19:
                return new MediaMetadataCompat(parcel);
            case 20:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 21:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = b.c.f8266b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.b.J);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.b)) {
                        C0843a c0843a = new C0843a();
                        c0843a.f8265a = strongBinder;
                        bVar = c0843a;
                    } else {
                        bVar = (b.b) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f7308a = bVar;
                return resultReceiver;
            case 22:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new RemoteMessage(bundleCreateBundle);
            case 23:
                j.g(parcel, "parcel");
                Operator operator = (Operator) parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i4);
                    for (int i6 = 0; i6 != i4; i6++) {
                        arrayList6.add(parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader()));
                    }
                    arrayList = arrayList6;
                }
                Route route = (Route) parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int i10 = parcel.readInt();
                    arrayList2 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList2.add(parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader()));
                    }
                }
                return new MayaTravelViewDataSelection(operator, arrayList, route, arrayList2, (Stop) parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader()), (Stop) parcel.readParcelable(MayaTravelViewDataSelection.class.getClassLoader()));
            case 24:
                return new Format(parcel);
            case 25:
                return new DrmInitData(parcel);
            case 26:
                return new Metadata(parcel);
            case 27:
                return new PictureFrame(parcel);
            case 28:
                return new ApicFrame(parcel);
            default:
                return new TrackGroup(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f19a) {
            case 0:
                return new ColorInfo[i];
            case 1:
                return new CleverTapDisplayUnit[i];
            case 2:
                return new CleverTapDisplayUnitContent[i];
            case 3:
                return new CreditReviewUiModel[i];
            case 4:
                return new ImageUrl[i];
            case 5:
                return new ImageUrlIOS[i];
            case 6:
                return new ImageUrlUnfiltered[i];
            case 7:
                return new CTInAppNotification[i];
            case 8:
                return new CTInAppNotificationButton[i];
            case 9:
                return new CTInAppNotificationMedia[i];
            case 10:
                return new Counter[i];
            case 11:
                return new Trace[i];
            case 12:
                return new PerfSession[i];
            case 13:
                return new Timer[i];
            case 14:
                return new FavoriteCategory[i];
            case 15:
                return new CTInboxMessage[i];
            case 16:
                return new CTInboxMessageContent[i];
            case 17:
                return new MediaBrowserCompat$MediaItem[i];
            case 18:
                return new MediaDescriptionCompat[i];
            case 19:
                return new MediaMetadataCompat[i];
            case 20:
                return new RatingCompat[i];
            case 21:
                return new ResultReceiver[i];
            case 22:
                return new RemoteMessage[i];
            case 23:
                return new MayaTravelViewDataSelection[i];
            case 24:
                return new Format[i];
            case 25:
                return new DrmInitData[i];
            case 26:
                return new Metadata[i];
            case 27:
                return new PictureFrame[i];
            case 28:
                return new ApicFrame[i];
            default:
                return new TrackGroup[i];
        }
    }
}
