package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1391o;
import dg.C1392p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String advertisingId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String apiLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final String deviceId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    private final String drmId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 17)
    private final List<String> enabledAccessibilityServices;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    private final String gsfId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String languageCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 12, tag = 13)
    private final List<String> localeDisplayLanguage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 16)
    private final String nextAlarmClock;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String osVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String productName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    private final String regionCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 14, tag = 15)
    private final Integer timezone;
    public static final C1392p Companion = new C1392p();
    public static final ProtoAdapter<DeviceFragment> ADAPTER = new C1391o(FieldEncoding.LENGTH_DELIMITED, z.a(DeviceFragment.class), "type.googleapis.com/dde.protobuf.fragments.DeviceFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/DeviceFragment.proto");

    public DeviceFragment() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final DeviceFragment copy(ExtractionDetails extractionDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> localeDisplayLanguage, String str12, Integer num, String str13, List<String> enabledAccessibilityServices, ByteString unknownFields) {
        j.g(localeDisplayLanguage, "localeDisplayLanguage");
        j.g(enabledAccessibilityServices, "enabledAccessibilityServices");
        j.g(unknownFields, "unknownFields");
        return new DeviceFragment(extractionDetails, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, localeDisplayLanguage, str12, num, str13, enabledAccessibilityServices, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceFragment)) {
            return false;
        }
        DeviceFragment deviceFragment = (DeviceFragment) obj;
        return j.b(unknownFields(), deviceFragment.unknownFields()) && j.b(this.extractionDetails, deviceFragment.extractionDetails) && j.b(this.name, deviceFragment.name) && j.b(this.model, deviceFragment.model) && j.b(this.brand, deviceFragment.brand) && j.b(this.productName, deviceFragment.productName) && j.b(this.osVersion, deviceFragment.osVersion) && j.b(this.apiLevel, deviceFragment.apiLevel) && j.b(this.advertisingId, deviceFragment.advertisingId) && j.b(this.drmId, deviceFragment.drmId) && j.b(this.deviceId, deviceFragment.deviceId) && j.b(this.gsfId, deviceFragment.gsfId) && j.b(this.languageCode, deviceFragment.languageCode) && j.b(this.localeDisplayLanguage, deviceFragment.localeDisplayLanguage) && j.b(this.regionCode, deviceFragment.regionCode) && j.b(this.timezone, deviceFragment.timezone) && j.b(this.nextAlarmClock, deviceFragment.nextAlarmClock) && j.b(this.enabledAccessibilityServices, deviceFragment.enabledAccessibilityServices);
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final String getApiLevel() {
        return this.apiLevel;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDrmId() {
        return this.drmId;
    }

    public final List<String> getEnabledAccessibilityServices() {
        return this.enabledAccessibilityServices;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final String getGsfId() {
        return this.gsfId;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final List<String> getLocaleDisplayLanguage() {
        return this.localeDisplayLanguage;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNextAlarmClock() {
        return this.nextAlarmClock;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final Integer getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.model;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.brand;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.productName;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.osVersion;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.apiLevel;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.advertisingId;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.drmId;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.deviceId;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.gsfId;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.languageCode;
        int iD = AbstractC1414e.d(this.localeDisplayLanguage, (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 37, 37);
        String str12 = this.regionCode;
        int iHashCode13 = (iD + (str12 != null ? str12.hashCode() : 0)) * 37;
        Integer num = this.timezone;
        int iHashCode14 = (iHashCode13 + (num != null ? num.hashCode() : 0)) * 37;
        String str13 = this.nextAlarmClock;
        int iHashCode15 = this.enabledAccessibilityServices.hashCode() + ((iHashCode14 + (str13 != null ? str13.hashCode() : 0)) * 37);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m233newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (this.name != null) {
            AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        }
        if (this.model != null) {
            AbstractC1414e.p(this.model, new StringBuilder("model="), arrayList);
        }
        if (this.brand != null) {
            AbstractC1414e.p(this.brand, new StringBuilder("brand="), arrayList);
        }
        if (this.productName != null) {
            AbstractC1414e.p(this.productName, new StringBuilder("productName="), arrayList);
        }
        if (this.osVersion != null) {
            AbstractC1414e.p(this.osVersion, new StringBuilder("osVersion="), arrayList);
        }
        if (this.apiLevel != null) {
            AbstractC1414e.p(this.apiLevel, new StringBuilder("apiLevel="), arrayList);
        }
        if (this.advertisingId != null) {
            AbstractC1414e.p(this.advertisingId, new StringBuilder("advertisingId="), arrayList);
        }
        if (this.drmId != null) {
            AbstractC1414e.p(this.drmId, new StringBuilder("drmId="), arrayList);
        }
        if (this.deviceId != null) {
            AbstractC1414e.p(this.deviceId, new StringBuilder("deviceId="), arrayList);
        }
        if (this.gsfId != null) {
            AbstractC1414e.p(this.gsfId, new StringBuilder("gsfId="), arrayList);
        }
        if (this.languageCode != null) {
            AbstractC1414e.p(this.languageCode, new StringBuilder("languageCode="), arrayList);
        }
        if (!this.localeDisplayLanguage.isEmpty()) {
            arrayList.add("localeDisplayLanguage=" + Internal.sanitize(this.localeDisplayLanguage));
        }
        if (this.regionCode != null) {
            AbstractC1414e.p(this.regionCode, new StringBuilder("regionCode="), arrayList);
        }
        if (this.timezone != null) {
            AbstractC1414e.r(new StringBuilder("timezone="), this.timezone, arrayList);
        }
        if (this.nextAlarmClock != null) {
            AbstractC1414e.p(this.nextAlarmClock, new StringBuilder("nextAlarmClock="), arrayList);
        }
        if (!this.enabledAccessibilityServices.isEmpty()) {
            arrayList.add("enabledAccessibilityServices=" + Internal.sanitize(this.enabledAccessibilityServices));
        }
        return C1110A.F(arrayList, ", ", "DeviceFragment{", "}", null, 56);
    }

    public DeviceFragment(ExtractionDetails extractionDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, Integer num, String str13, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? C1112C.f9377a : list, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? C1112C.f9377a : list2, (i & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m233newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFragment(ExtractionDetails extractionDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<String> localeDisplayLanguage, String str12, Integer num, String str13, List<String> enabledAccessibilityServices, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(localeDisplayLanguage, "localeDisplayLanguage");
        j.g(enabledAccessibilityServices, "enabledAccessibilityServices");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.name = str;
        this.model = str2;
        this.brand = str3;
        this.productName = str4;
        this.osVersion = str5;
        this.apiLevel = str6;
        this.advertisingId = str7;
        this.drmId = str8;
        this.deviceId = str9;
        this.gsfId = str10;
        this.languageCode = str11;
        this.regionCode = str12;
        this.timezone = num;
        this.nextAlarmClock = str13;
        this.localeDisplayLanguage = Internal.immutableCopyOf("localeDisplayLanguage", localeDisplayLanguage);
        this.enabledAccessibilityServices = Internal.immutableCopyOf("enabledAccessibilityServices", enabledAccessibilityServices);
    }
}
