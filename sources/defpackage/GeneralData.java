package defpackage;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class GeneralData extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advertisingId", schemaIndex = 7, tag = 8)
    private final String advertising_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceApiLevel", schemaIndex = 31, tag = 32)
    private final String device_api_level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceBrand", schemaIndex = 2, tag = 3)
    private final String device_brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceId", schemaIndex = 0, tag = 1)
    private final String device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceModel", schemaIndex = 3, tag = 4)
    private final String device_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceName", schemaIndex = 1, tag = 2)
    private final String device_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceOsVersion", schemaIndex = 4, tag = 5)
    private final String device_os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceProductName", schemaIndex = 5, tag = 6)
    private final String device_product_name;

    @WireField(adapter = "Dimension#ADAPTER", jsonName = "deviceScreenSize", schemaIndex = 6, tag = 7)
    private final Dimension device_screen_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "drmId", schemaIndex = 23, tag = 24)
    private final String drm_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enabledAccessibilityServices", label = WireField.Label.REPEATED, schemaIndex = 12, tag = 13)
    private final List<String> enabled_accessibility_services;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gsfId", schemaIndex = 24, tag = 25)
    private final String gsf_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipAddress", schemaIndex = 32, tag = 33)
    private final String ip_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isBluetoothOn", schemaIndex = 10, tag = 11)
    private final Boolean is_bluetooth_on;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDebuggerAttached", schemaIndex = 28, tag = 29)
    private final Boolean is_debugger_attached;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDeveloperModeEnabled", schemaIndex = 27, tag = 28)
    private final Boolean is_developer_mode_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFingerprintEnrolled", schemaIndex = 16, tag = 17)
    private final Boolean is_fingerprint_enrolled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLocationEnabled", schemaIndex = 8, tag = 9)
    private final Boolean is_location_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOnDataRoaming", schemaIndex = 11, tag = 12)
    private final Boolean is_on_data_roaming;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRooted", schemaIndex = 14, tag = 15)
    private final Boolean is_rooted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isScreenBeingShared", schemaIndex = 26, tag = 27)
    private final Boolean is_screen_being_shared;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSystemUser", schemaIndex = 25, tag = 26)
    private final Boolean is_system_user;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUsbDebuggingEnabled", schemaIndex = 29, tag = 30)
    private final Boolean is_usb_debugging_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVirtual", schemaIndex = 13, tag = 14)
    private final Boolean is_virtual;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVpnConnected", schemaIndex = 15, tag = 16)
    private final Boolean is_vpn_connected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isWifiDebuggingEnabled", schemaIndex = 30, tag = 31)
    private final Boolean is_wifi_debugging_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isWifiEnabled", schemaIndex = 9, tag = 10)
    private final Boolean is_wifi_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "languageCode", schemaIndex = 19, tag = 20)
    private final String language_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "localeDisplayLanguage", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 23)
    private final List<String> locale_display_language;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextAlarmClock", schemaIndex = 17, tag = 18)
    private final String next_alarm_clock;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "phoneType", schemaIndex = 18, tag = 19)
    private final Integer phone_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "regionCode", schemaIndex = 20, tag = 21)
    private final String region_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "storageTimestamp", schemaIndex = 34, tag = 35)
    private final String storage_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 21, tag = 22)
    private final Integer timezone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", schemaIndex = 33, tag = 34)
    private final String user_agent;
    public static final I Companion = new I();
    public static final ProtoAdapter<GeneralData> ADAPTER = new H(FieldEncoding.LENGTH_DELIMITED, z.a(GeneralData.class), "type.googleapis.com/GeneralData", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public GeneralData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    public final GeneralData copy(String str, String str2, String str3, String str4, String str5, String str6, Dimension dimension, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<String> enabled_accessibility_services, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str8, Integer num, String str9, String str10, Integer num2, List<String> locale_display_language, String str11, String str12, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str13, String str14, String str15, String str16, ByteString unknownFields) {
        j.g(enabled_accessibility_services, "enabled_accessibility_services");
        j.g(locale_display_language, "locale_display_language");
        j.g(unknownFields, "unknownFields");
        return new GeneralData(str, str2, str3, str4, str5, str6, dimension, str7, bool, bool2, bool3, bool4, enabled_accessibility_services, bool5, bool6, bool7, bool8, str8, num, str9, str10, num2, locale_display_language, str11, str12, bool9, bool10, bool11, bool12, bool13, bool14, str13, str14, str15, str16, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeneralData)) {
            return false;
        }
        GeneralData generalData = (GeneralData) obj;
        return j.b(unknownFields(), generalData.unknownFields()) && j.b(this.device_id, generalData.device_id) && j.b(this.device_name, generalData.device_name) && j.b(this.device_brand, generalData.device_brand) && j.b(this.device_model, generalData.device_model) && j.b(this.device_os_version, generalData.device_os_version) && j.b(this.device_product_name, generalData.device_product_name) && j.b(this.device_screen_size, generalData.device_screen_size) && j.b(this.advertising_id, generalData.advertising_id) && j.b(this.is_location_enabled, generalData.is_location_enabled) && j.b(this.is_wifi_enabled, generalData.is_wifi_enabled) && j.b(this.is_bluetooth_on, generalData.is_bluetooth_on) && j.b(this.is_on_data_roaming, generalData.is_on_data_roaming) && j.b(this.enabled_accessibility_services, generalData.enabled_accessibility_services) && j.b(this.is_virtual, generalData.is_virtual) && j.b(this.is_rooted, generalData.is_rooted) && j.b(this.is_vpn_connected, generalData.is_vpn_connected) && j.b(this.is_fingerprint_enrolled, generalData.is_fingerprint_enrolled) && j.b(this.next_alarm_clock, generalData.next_alarm_clock) && j.b(this.phone_type, generalData.phone_type) && j.b(this.language_code, generalData.language_code) && j.b(this.region_code, generalData.region_code) && j.b(this.timezone, generalData.timezone) && j.b(this.locale_display_language, generalData.locale_display_language) && j.b(this.drm_id, generalData.drm_id) && j.b(this.gsf_id, generalData.gsf_id) && j.b(this.is_system_user, generalData.is_system_user) && j.b(this.is_screen_being_shared, generalData.is_screen_being_shared) && j.b(this.is_developer_mode_enabled, generalData.is_developer_mode_enabled) && j.b(this.is_debugger_attached, generalData.is_debugger_attached) && j.b(this.is_usb_debugging_enabled, generalData.is_usb_debugging_enabled) && j.b(this.is_wifi_debugging_enabled, generalData.is_wifi_debugging_enabled) && j.b(this.device_api_level, generalData.device_api_level) && j.b(this.ip_address, generalData.ip_address) && j.b(this.user_agent, generalData.user_agent) && j.b(this.storage_timestamp, generalData.storage_timestamp);
    }

    public final String getAdvertising_id() {
        return this.advertising_id;
    }

    public final String getDevice_api_level() {
        return this.device_api_level;
    }

    public final String getDevice_brand() {
        return this.device_brand;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getDevice_model() {
        return this.device_model;
    }

    public final String getDevice_name() {
        return this.device_name;
    }

    public final String getDevice_os_version() {
        return this.device_os_version;
    }

    public final String getDevice_product_name() {
        return this.device_product_name;
    }

    public final Dimension getDevice_screen_size() {
        return this.device_screen_size;
    }

    public final String getDrm_id() {
        return this.drm_id;
    }

    public final List<String> getEnabled_accessibility_services() {
        return this.enabled_accessibility_services;
    }

    public final String getGsf_id() {
        return this.gsf_id;
    }

    public final String getIp_address() {
        return this.ip_address;
    }

    public final String getLanguage_code() {
        return this.language_code;
    }

    public final List<String> getLocale_display_language() {
        return this.locale_display_language;
    }

    public final String getNext_alarm_clock() {
        return this.next_alarm_clock;
    }

    public final Integer getPhone_type() {
        return this.phone_type;
    }

    public final String getRegion_code() {
        return this.region_code;
    }

    public final String getStorage_timestamp() {
        return this.storage_timestamp;
    }

    public final Integer getTimezone() {
        return this.timezone;
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.device_brand;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.device_model;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.device_os_version;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.device_product_name;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Dimension dimension = this.device_screen_size;
        int iHashCode8 = (iHashCode7 + (dimension != null ? dimension.hashCode() : 0)) * 37;
        String str7 = this.advertising_id;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool = this.is_location_enabled;
        int iHashCode10 = (iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_wifi_enabled;
        int iHashCode11 = (iHashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_bluetooth_on;
        int iHashCode12 = (iHashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.is_on_data_roaming;
        int iD = AbstractC1414e.d(this.enabled_accessibility_services, (iHashCode12 + (bool4 != null ? bool4.hashCode() : 0)) * 37, 37);
        Boolean bool5 = this.is_virtual;
        int iHashCode13 = (iD + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.is_rooted;
        int iHashCode14 = (iHashCode13 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.is_vpn_connected;
        int iHashCode15 = (iHashCode14 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.is_fingerprint_enrolled;
        int iHashCode16 = (iHashCode15 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        String str8 = this.next_alarm_clock;
        int iHashCode17 = (iHashCode16 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Integer num = this.phone_type;
        int iHashCode18 = (iHashCode17 + (num != null ? num.hashCode() : 0)) * 37;
        String str9 = this.language_code;
        int iHashCode19 = (iHashCode18 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.region_code;
        int iHashCode20 = (iHashCode19 + (str10 != null ? str10.hashCode() : 0)) * 37;
        Integer num2 = this.timezone;
        int iD2 = AbstractC1414e.d(this.locale_display_language, (iHashCode20 + (num2 != null ? num2.hashCode() : 0)) * 37, 37);
        String str11 = this.drm_id;
        int iHashCode21 = (iD2 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.gsf_id;
        int iHashCode22 = (iHashCode21 + (str12 != null ? str12.hashCode() : 0)) * 37;
        Boolean bool9 = this.is_system_user;
        int iHashCode23 = (iHashCode22 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.is_screen_being_shared;
        int iHashCode24 = (iHashCode23 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Boolean bool11 = this.is_developer_mode_enabled;
        int iHashCode25 = (iHashCode24 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.is_debugger_attached;
        int iHashCode26 = (iHashCode25 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.is_usb_debugging_enabled;
        int iHashCode27 = (iHashCode26 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.is_wifi_debugging_enabled;
        int iHashCode28 = (iHashCode27 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        String str13 = this.device_api_level;
        int iHashCode29 = (iHashCode28 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.ip_address;
        int iHashCode30 = (iHashCode29 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.user_agent;
        int iHashCode31 = (iHashCode30 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.storage_timestamp;
        int iHashCode32 = iHashCode31 + (str16 != null ? str16.hashCode() : 0);
        this.hashCode = iHashCode32;
        return iHashCode32;
    }

    public final Boolean is_bluetooth_on() {
        return this.is_bluetooth_on;
    }

    public final Boolean is_debugger_attached() {
        return this.is_debugger_attached;
    }

    public final Boolean is_developer_mode_enabled() {
        return this.is_developer_mode_enabled;
    }

    public final Boolean is_fingerprint_enrolled() {
        return this.is_fingerprint_enrolled;
    }

    public final Boolean is_location_enabled() {
        return this.is_location_enabled;
    }

    public final Boolean is_on_data_roaming() {
        return this.is_on_data_roaming;
    }

    public final Boolean is_rooted() {
        return this.is_rooted;
    }

    public final Boolean is_screen_being_shared() {
        return this.is_screen_being_shared;
    }

    public final Boolean is_system_user() {
        return this.is_system_user;
    }

    public final Boolean is_usb_debugging_enabled() {
        return this.is_usb_debugging_enabled;
    }

    public final Boolean is_virtual() {
        return this.is_virtual;
    }

    public final Boolean is_vpn_connected() {
        return this.is_vpn_connected;
    }

    public final Boolean is_wifi_debugging_enabled() {
        return this.is_wifi_debugging_enabled;
    }

    public final Boolean is_wifi_enabled() {
        return this.is_wifi_enabled;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m15newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.device_id != null) {
            AbstractC1414e.p(this.device_id, new StringBuilder("device_id="), arrayList);
        }
        if (this.device_name != null) {
            AbstractC1414e.p(this.device_name, new StringBuilder("device_name="), arrayList);
        }
        if (this.device_brand != null) {
            AbstractC1414e.p(this.device_brand, new StringBuilder("device_brand="), arrayList);
        }
        if (this.device_model != null) {
            AbstractC1414e.p(this.device_model, new StringBuilder("device_model="), arrayList);
        }
        if (this.device_os_version != null) {
            AbstractC1414e.p(this.device_os_version, new StringBuilder("device_os_version="), arrayList);
        }
        if (this.device_product_name != null) {
            AbstractC1414e.p(this.device_product_name, new StringBuilder("device_product_name="), arrayList);
        }
        if (this.device_screen_size != null) {
            arrayList.add("device_screen_size=" + this.device_screen_size);
        }
        if (this.advertising_id != null) {
            AbstractC1414e.p(this.advertising_id, new StringBuilder("advertising_id="), arrayList);
        }
        if (this.is_location_enabled != null) {
            AbstractC1414e.q(new StringBuilder("is_location_enabled="), this.is_location_enabled, arrayList);
        }
        if (this.is_wifi_enabled != null) {
            AbstractC1414e.q(new StringBuilder("is_wifi_enabled="), this.is_wifi_enabled, arrayList);
        }
        if (this.is_bluetooth_on != null) {
            AbstractC1414e.q(new StringBuilder("is_bluetooth_on="), this.is_bluetooth_on, arrayList);
        }
        if (this.is_on_data_roaming != null) {
            AbstractC1414e.q(new StringBuilder("is_on_data_roaming="), this.is_on_data_roaming, arrayList);
        }
        if (!this.enabled_accessibility_services.isEmpty()) {
            arrayList.add("enabled_accessibility_services=" + Internal.sanitize(this.enabled_accessibility_services));
        }
        if (this.is_virtual != null) {
            AbstractC1414e.q(new StringBuilder("is_virtual="), this.is_virtual, arrayList);
        }
        if (this.is_rooted != null) {
            AbstractC1414e.q(new StringBuilder("is_rooted="), this.is_rooted, arrayList);
        }
        if (this.is_vpn_connected != null) {
            AbstractC1414e.q(new StringBuilder("is_vpn_connected="), this.is_vpn_connected, arrayList);
        }
        if (this.is_fingerprint_enrolled != null) {
            AbstractC1414e.q(new StringBuilder("is_fingerprint_enrolled="), this.is_fingerprint_enrolled, arrayList);
        }
        if (this.next_alarm_clock != null) {
            AbstractC1414e.p(this.next_alarm_clock, new StringBuilder("next_alarm_clock="), arrayList);
        }
        if (this.phone_type != null) {
            AbstractC1414e.r(new StringBuilder("phone_type="), this.phone_type, arrayList);
        }
        if (this.language_code != null) {
            AbstractC1414e.p(this.language_code, new StringBuilder("language_code="), arrayList);
        }
        if (this.region_code != null) {
            AbstractC1414e.p(this.region_code, new StringBuilder("region_code="), arrayList);
        }
        if (this.timezone != null) {
            AbstractC1414e.r(new StringBuilder("timezone="), this.timezone, arrayList);
        }
        if (!this.locale_display_language.isEmpty()) {
            arrayList.add("locale_display_language=" + Internal.sanitize(this.locale_display_language));
        }
        if (this.drm_id != null) {
            AbstractC1414e.p(this.drm_id, new StringBuilder("drm_id="), arrayList);
        }
        if (this.gsf_id != null) {
            AbstractC1414e.p(this.gsf_id, new StringBuilder("gsf_id="), arrayList);
        }
        if (this.is_system_user != null) {
            AbstractC1414e.q(new StringBuilder("is_system_user="), this.is_system_user, arrayList);
        }
        if (this.is_screen_being_shared != null) {
            AbstractC1414e.q(new StringBuilder("is_screen_being_shared="), this.is_screen_being_shared, arrayList);
        }
        if (this.is_developer_mode_enabled != null) {
            AbstractC1414e.q(new StringBuilder("is_developer_mode_enabled="), this.is_developer_mode_enabled, arrayList);
        }
        if (this.is_debugger_attached != null) {
            AbstractC1414e.q(new StringBuilder("is_debugger_attached="), this.is_debugger_attached, arrayList);
        }
        if (this.is_usb_debugging_enabled != null) {
            AbstractC1414e.q(new StringBuilder("is_usb_debugging_enabled="), this.is_usb_debugging_enabled, arrayList);
        }
        if (this.is_wifi_debugging_enabled != null) {
            AbstractC1414e.q(new StringBuilder("is_wifi_debugging_enabled="), this.is_wifi_debugging_enabled, arrayList);
        }
        if (this.device_api_level != null) {
            AbstractC1414e.p(this.device_api_level, new StringBuilder("device_api_level="), arrayList);
        }
        if (this.ip_address != null) {
            AbstractC1414e.p(this.ip_address, new StringBuilder("ip_address="), arrayList);
        }
        if (this.user_agent != null) {
            AbstractC1414e.p(this.user_agent, new StringBuilder("user_agent="), arrayList);
        }
        if (this.storage_timestamp != null) {
            AbstractC1414e.p(this.storage_timestamp, new StringBuilder("storage_timestamp="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "GeneralData{", "}", null, 56);
    }

    public GeneralData(String str, String str2, String str3, String str4, String str5, String str6, Dimension dimension, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str8, Integer num, String str9, String str10, Integer num2, List list2, String str11, String str12, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str13, String str14, String str15, String str16, ByteString byteString, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : dimension, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? C1112C.f9377a : list, (i & 8192) != 0 ? null : bool5, (i & 16384) != 0 ? null : bool6, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : bool8, (i & 131072) != 0 ? null : str8, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? null : str9, (i & 1048576) != 0 ? null : str10, (i & 2097152) != 0 ? null : num2, (i & 4194304) != 0 ? C1112C.f9377a : list2, (i & 8388608) != 0 ? null : str11, (i & 16777216) != 0 ? null : str12, (i & 33554432) != 0 ? null : bool9, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : bool10, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : bool11, (i & 268435456) != 0 ? null : bool12, (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : bool13, (i & 1073741824) != 0 ? null : bool14, (i & Integer.MIN_VALUE) != 0 ? null : str13, (i4 & 1) != 0 ? null : str14, (i4 & 2) != 0 ? null : str15, (i4 & 4) != 0 ? null : str16, (i4 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m15newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralData(String str, String str2, String str3, String str4, String str5, String str6, Dimension dimension, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<String> enabled_accessibility_services, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str8, Integer num, String str9, String str10, Integer num2, List<String> locale_display_language, String str11, String str12, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str13, String str14, String str15, String str16, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(enabled_accessibility_services, "enabled_accessibility_services");
        j.g(locale_display_language, "locale_display_language");
        j.g(unknownFields, "unknownFields");
        this.device_id = str;
        this.device_name = str2;
        this.device_brand = str3;
        this.device_model = str4;
        this.device_os_version = str5;
        this.device_product_name = str6;
        this.device_screen_size = dimension;
        this.advertising_id = str7;
        this.is_location_enabled = bool;
        this.is_wifi_enabled = bool2;
        this.is_bluetooth_on = bool3;
        this.is_on_data_roaming = bool4;
        this.is_virtual = bool5;
        this.is_rooted = bool6;
        this.is_vpn_connected = bool7;
        this.is_fingerprint_enrolled = bool8;
        this.next_alarm_clock = str8;
        this.phone_type = num;
        this.language_code = str9;
        this.region_code = str10;
        this.timezone = num2;
        this.drm_id = str11;
        this.gsf_id = str12;
        this.is_system_user = bool9;
        this.is_screen_being_shared = bool10;
        this.is_developer_mode_enabled = bool11;
        this.is_debugger_attached = bool12;
        this.is_usb_debugging_enabled = bool13;
        this.is_wifi_debugging_enabled = bool14;
        this.device_api_level = str13;
        this.ip_address = str14;
        this.user_agent = str15;
        this.storage_timestamp = str16;
        this.enabled_accessibility_services = Internal.immutableCopyOf("enabled_accessibility_services", enabled_accessibility_services);
        this.locale_display_language = Internal.immutableCopyOf("locale_display_language", locale_display_language);
    }
}
