package defpackage;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class H extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        ArrayList arrayList = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        String strDecode5 = null;
        Dimension dimensionDecode = null;
        String strDecode6 = null;
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        Boolean boolDecode4 = null;
        Boolean boolDecode5 = null;
        Boolean boolDecode6 = null;
        Boolean boolDecode7 = null;
        Boolean boolDecode8 = null;
        String strDecode7 = null;
        Integer numDecode = null;
        String strDecode8 = null;
        String strDecode9 = null;
        Integer numDecode2 = null;
        String strDecode10 = null;
        String strDecode11 = null;
        Boolean boolDecode9 = null;
        Boolean boolDecode10 = null;
        Boolean boolDecode11 = null;
        Boolean boolDecode12 = null;
        Boolean boolDecode13 = null;
        Boolean boolDecode14 = null;
        String strDecode12 = null;
        String strDecode13 = null;
        String strDecode14 = null;
        String strDecode15 = null;
        String strDecode16 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            String str = strDecode;
            if (iNextTag == -1) {
                return new GeneralData(strDecode16, str, strDecode2, strDecode3, strDecode4, strDecode5, dimensionDecode, strDecode6, boolDecode, boolDecode2, boolDecode3, boolDecode4, arrayListJ, boolDecode5, boolDecode6, boolDecode7, boolDecode8, strDecode7, numDecode, strDecode8, strDecode9, numDecode2, arrayList, strDecode10, strDecode11, boolDecode9, boolDecode10, boolDecode11, boolDecode12, boolDecode13, boolDecode14, strDecode12, strDecode13, strDecode14, strDecode15, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode16 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    dimensionDecode = Dimension.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 11:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 12:
                    boolDecode4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 13:
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 14:
                    boolDecode5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 15:
                    boolDecode6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 16:
                    boolDecode7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 17:
                    boolDecode8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 18:
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 19:
                    numDecode = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 20:
                    strDecode8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 21:
                    strDecode9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 22:
                    numDecode2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 23:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 24:
                    strDecode10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 25:
                    strDecode11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 26:
                    boolDecode9 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 27:
                    boolDecode10 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 28:
                    boolDecode11 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 29:
                    boolDecode12 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 30:
                    boolDecode13 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 31:
                    boolDecode14 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 32:
                    strDecode12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 33:
                    strDecode13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 34:
                    strDecode14 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 35:
                    strDecode15 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
            strDecode = str;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        GeneralData value = (GeneralData) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getDevice_id());
        protoAdapter.encodeWithTag(writer, 2, value.getDevice_name());
        protoAdapter.encodeWithTag(writer, 3, value.getDevice_brand());
        protoAdapter.encodeWithTag(writer, 4, value.getDevice_model());
        protoAdapter.encodeWithTag(writer, 5, value.getDevice_os_version());
        protoAdapter.encodeWithTag(writer, 6, value.getDevice_product_name());
        Dimension.ADAPTER.encodeWithTag(writer, 7, value.getDevice_screen_size());
        protoAdapter.encodeWithTag(writer, 8, value.getAdvertising_id());
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(writer, 9, value.is_location_enabled());
        protoAdapter2.encodeWithTag(writer, 10, value.is_wifi_enabled());
        protoAdapter2.encodeWithTag(writer, 11, value.is_bluetooth_on());
        protoAdapter2.encodeWithTag(writer, 12, value.is_on_data_roaming());
        protoAdapter.asRepeated().encodeWithTag(writer, 13, value.getEnabled_accessibility_services());
        protoAdapter2.encodeWithTag(writer, 14, value.is_virtual());
        protoAdapter2.encodeWithTag(writer, 15, value.is_rooted());
        protoAdapter2.encodeWithTag(writer, 16, value.is_vpn_connected());
        protoAdapter2.encodeWithTag(writer, 17, value.is_fingerprint_enrolled());
        protoAdapter.encodeWithTag(writer, 18, value.getNext_alarm_clock());
        ProtoAdapter.UINT32.encodeWithTag(writer, 19, value.getPhone_type());
        protoAdapter.encodeWithTag(writer, 20, value.getLanguage_code());
        protoAdapter.encodeWithTag(writer, 21, value.getRegion_code());
        ProtoAdapter.INT32.encodeWithTag(writer, 22, value.getTimezone());
        protoAdapter.asRepeated().encodeWithTag(writer, 23, value.getLocale_display_language());
        protoAdapter.encodeWithTag(writer, 24, value.getDrm_id());
        protoAdapter.encodeWithTag(writer, 25, value.getGsf_id());
        protoAdapter2.encodeWithTag(writer, 26, value.is_system_user());
        protoAdapter2.encodeWithTag(writer, 27, value.is_screen_being_shared());
        protoAdapter2.encodeWithTag(writer, 28, value.is_developer_mode_enabled());
        protoAdapter2.encodeWithTag(writer, 29, value.is_debugger_attached());
        protoAdapter2.encodeWithTag(writer, 30, value.is_usb_debugging_enabled());
        protoAdapter2.encodeWithTag(writer, 31, value.is_wifi_debugging_enabled());
        protoAdapter.encodeWithTag(writer, 32, value.getDevice_api_level());
        protoAdapter.encodeWithTag(writer, 33, value.getIp_address());
        protoAdapter.encodeWithTag(writer, 34, value.getUser_agent());
        protoAdapter.encodeWithTag(writer, 35, value.getStorage_timestamp());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GeneralData value = (GeneralData) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(8, value.getAdvertising_id()) + Dimension.ADAPTER.encodedSizeWithTag(7, value.getDevice_screen_size()) + protoAdapter.encodedSizeWithTag(6, value.getDevice_product_name()) + protoAdapter.encodedSizeWithTag(5, value.getDevice_os_version()) + protoAdapter.encodedSizeWithTag(4, value.getDevice_model()) + protoAdapter.encodedSizeWithTag(3, value.getDevice_brand()) + protoAdapter.encodedSizeWithTag(2, value.getDevice_name()) + protoAdapter.encodedSizeWithTag(1, value.getDevice_id()) + size;
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(35, value.getStorage_timestamp()) + protoAdapter.encodedSizeWithTag(34, value.getUser_agent()) + protoAdapter.encodedSizeWithTag(33, value.getIp_address()) + protoAdapter.encodedSizeWithTag(32, value.getDevice_api_level()) + protoAdapter2.encodedSizeWithTag(31, value.is_wifi_debugging_enabled()) + protoAdapter2.encodedSizeWithTag(30, value.is_usb_debugging_enabled()) + protoAdapter2.encodedSizeWithTag(29, value.is_debugger_attached()) + protoAdapter2.encodedSizeWithTag(28, value.is_developer_mode_enabled()) + protoAdapter2.encodedSizeWithTag(27, value.is_screen_being_shared()) + protoAdapter2.encodedSizeWithTag(26, value.is_system_user()) + protoAdapter.encodedSizeWithTag(25, value.getGsf_id()) + protoAdapter.encodedSizeWithTag(24, value.getDrm_id()) + protoAdapter.asRepeated().encodedSizeWithTag(23, value.getLocale_display_language()) + ProtoAdapter.INT32.encodedSizeWithTag(22, value.getTimezone()) + protoAdapter.encodedSizeWithTag(21, value.getRegion_code()) + protoAdapter.encodedSizeWithTag(20, value.getLanguage_code()) + ProtoAdapter.UINT32.encodedSizeWithTag(19, value.getPhone_type()) + protoAdapter.encodedSizeWithTag(18, value.getNext_alarm_clock()) + protoAdapter2.encodedSizeWithTag(17, value.is_fingerprint_enrolled()) + protoAdapter2.encodedSizeWithTag(16, value.is_vpn_connected()) + protoAdapter2.encodedSizeWithTag(15, value.is_rooted()) + protoAdapter2.encodedSizeWithTag(14, value.is_virtual()) + protoAdapter.asRepeated().encodedSizeWithTag(13, value.getEnabled_accessibility_services()) + protoAdapter2.encodedSizeWithTag(12, value.is_on_data_roaming()) + protoAdapter2.encodedSizeWithTag(11, value.is_bluetooth_on()) + protoAdapter2.encodedSizeWithTag(10, value.is_wifi_enabled()) + protoAdapter2.encodedSizeWithTag(9, value.is_location_enabled()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GeneralData value = (GeneralData) obj;
        j.g(value, "value");
        Dimension device_screen_size = value.getDevice_screen_size();
        return value.copy(((-65) & 1) != 0 ? value.device_id : null, ((-65) & 2) != 0 ? value.device_name : null, ((-65) & 4) != 0 ? value.device_brand : null, ((-65) & 8) != 0 ? value.device_model : null, ((-65) & 16) != 0 ? value.device_os_version : null, ((-65) & 32) != 0 ? value.device_product_name : null, ((-65) & 64) != 0 ? value.device_screen_size : device_screen_size != null ? Dimension.ADAPTER.redact(device_screen_size) : null, ((-65) & 128) != 0 ? value.advertising_id : null, ((-65) & 256) != 0 ? value.is_location_enabled : null, ((-65) & 512) != 0 ? value.is_wifi_enabled : null, ((-65) & 1024) != 0 ? value.is_bluetooth_on : null, ((-65) & 2048) != 0 ? value.is_on_data_roaming : null, ((-65) & 4096) != 0 ? value.enabled_accessibility_services : null, ((-65) & 8192) != 0 ? value.is_virtual : null, ((-65) & 16384) != 0 ? value.is_rooted : null, ((-65) & 32768) != 0 ? value.is_vpn_connected : null, ((-65) & 65536) != 0 ? value.is_fingerprint_enrolled : null, ((-65) & 131072) != 0 ? value.next_alarm_clock : null, ((-65) & 262144) != 0 ? value.phone_type : null, ((-65) & 524288) != 0 ? value.language_code : null, ((-65) & 1048576) != 0 ? value.region_code : null, ((-65) & 2097152) != 0 ? value.timezone : null, ((-65) & 4194304) != 0 ? value.locale_display_language : null, ((-65) & 8388608) != 0 ? value.drm_id : null, ((-65) & 16777216) != 0 ? value.gsf_id : null, ((-65) & 33554432) != 0 ? value.is_system_user : null, ((-65) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? value.is_screen_being_shared : null, ((-65) & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? value.is_developer_mode_enabled : null, ((-65) & 268435456) != 0 ? value.is_debugger_attached : null, ((-65) & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? value.is_usb_debugging_enabled : null, ((-65) & 1073741824) != 0 ? value.is_wifi_debugging_enabled : null, ((-65) & Integer.MIN_VALUE) != 0 ? value.device_api_level : null, (7 & 1) != 0 ? value.ip_address : null, (7 & 2) != 0 ? value.user_agent : null, (7 & 4) != 0 ? value.storage_timestamp : null, (7 & 8) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        GeneralData value = (GeneralData) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 35, value.getStorage_timestamp());
        protoAdapter.encodeWithTag(writer, 34, value.getUser_agent());
        protoAdapter.encodeWithTag(writer, 33, value.getIp_address());
        protoAdapter.encodeWithTag(writer, 32, value.getDevice_api_level());
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(writer, 31, value.is_wifi_debugging_enabled());
        protoAdapter2.encodeWithTag(writer, 30, value.is_usb_debugging_enabled());
        protoAdapter2.encodeWithTag(writer, 29, value.is_debugger_attached());
        protoAdapter2.encodeWithTag(writer, 28, value.is_developer_mode_enabled());
        protoAdapter2.encodeWithTag(writer, 27, value.is_screen_being_shared());
        protoAdapter2.encodeWithTag(writer, 26, value.is_system_user());
        protoAdapter.encodeWithTag(writer, 25, value.getGsf_id());
        protoAdapter.encodeWithTag(writer, 24, value.getDrm_id());
        protoAdapter.asRepeated().encodeWithTag(writer, 23, value.getLocale_display_language());
        ProtoAdapter.INT32.encodeWithTag(writer, 22, value.getTimezone());
        protoAdapter.encodeWithTag(writer, 21, value.getRegion_code());
        protoAdapter.encodeWithTag(writer, 20, value.getLanguage_code());
        ProtoAdapter.UINT32.encodeWithTag(writer, 19, value.getPhone_type());
        protoAdapter.encodeWithTag(writer, 18, value.getNext_alarm_clock());
        protoAdapter2.encodeWithTag(writer, 17, value.is_fingerprint_enrolled());
        protoAdapter2.encodeWithTag(writer, 16, value.is_vpn_connected());
        protoAdapter2.encodeWithTag(writer, 15, value.is_rooted());
        protoAdapter2.encodeWithTag(writer, 14, value.is_virtual());
        protoAdapter.asRepeated().encodeWithTag(writer, 13, value.getEnabled_accessibility_services());
        protoAdapter2.encodeWithTag(writer, 12, value.is_on_data_roaming());
        protoAdapter2.encodeWithTag(writer, 11, value.is_bluetooth_on());
        protoAdapter2.encodeWithTag(writer, 10, value.is_wifi_enabled());
        protoAdapter2.encodeWithTag(writer, 9, value.is_location_enabled());
        protoAdapter.encodeWithTag(writer, 8, value.getAdvertising_id());
        Dimension.ADAPTER.encodeWithTag(writer, 7, value.getDevice_screen_size());
        protoAdapter.encodeWithTag(writer, 6, value.getDevice_product_name());
        protoAdapter.encodeWithTag(writer, 5, value.getDevice_os_version());
        protoAdapter.encodeWithTag(writer, 4, value.getDevice_model());
        protoAdapter.encodeWithTag(writer, 3, value.getDevice_brand());
        protoAdapter.encodeWithTag(writer, 2, value.getDevice_name());
        protoAdapter.encodeWithTag(writer, 1, value.getDevice_id());
    }
}
