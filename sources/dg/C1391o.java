package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.DeviceFragment;
import dde.protobuf.fragments.ExtractionDetails;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1391o extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5bV"));
        ArrayList arrayList = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        String strDecode5 = null;
        String strDecode6 = null;
        String strDecode7 = null;
        String strDecode8 = null;
        String strDecode9 = null;
        String strDecode10 = null;
        String strDecode11 = null;
        String strDecode12 = null;
        Integer numDecode = null;
        String strDecode13 = null;
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            String str = strDecode;
            if (iNextTag == -1) {
                return new DeviceFragment(extractionDetailsDecode, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, arrayListJ, strDecode12, numDecode, strDecode13, arrayList, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
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
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    strDecode8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    strDecode9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    strDecode10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    strDecode11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 13:
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 14:
                    strDecode12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 15:
                    numDecode = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 16:
                    strDecode13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 17:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
            strDecode = str;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        DeviceFragment deviceFragment = (DeviceFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bS"));
        kotlin.jvm.internal.j.g(deviceFragment, numX49.tnTj78("bd5bj"));
        if (deviceFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, deviceFragment.getExtractionDetails());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, deviceFragment.getName());
        protoAdapter.encodeWithTag(protoWriter, 3, deviceFragment.getModel());
        protoAdapter.encodeWithTag(protoWriter, 4, deviceFragment.getBrand());
        protoAdapter.encodeWithTag(protoWriter, 5, deviceFragment.getProductName());
        protoAdapter.encodeWithTag(protoWriter, 6, deviceFragment.getOsVersion());
        protoAdapter.encodeWithTag(protoWriter, 7, deviceFragment.getApiLevel());
        protoAdapter.encodeWithTag(protoWriter, 8, deviceFragment.getAdvertisingId());
        protoAdapter.encodeWithTag(protoWriter, 9, deviceFragment.getDrmId());
        protoAdapter.encodeWithTag(protoWriter, 10, deviceFragment.getDeviceId());
        protoAdapter.encodeWithTag(protoWriter, 11, deviceFragment.getGsfId());
        protoAdapter.encodeWithTag(protoWriter, 12, deviceFragment.getLanguageCode());
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, deviceFragment.getLocaleDisplayLanguage());
        protoAdapter.encodeWithTag(protoWriter, 14, deviceFragment.getRegionCode());
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, deviceFragment.getTimezone());
        protoAdapter.encodeWithTag(protoWriter, 16, deviceFragment.getNextAlarmClock());
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 17, deviceFragment.getEnabledAccessibilityServices());
        protoWriter.writeBytes(deviceFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceFragment deviceFragment = (DeviceFragment) obj;
        kotlin.jvm.internal.j.g(deviceFragment, numX49.tnTj78("bd5bE"));
        int size = deviceFragment.unknownFields().size();
        if (deviceFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, deviceFragment.getExtractionDetails());
        }
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(17, deviceFragment.getEnabledAccessibilityServices()) + protoAdapter.encodedSizeWithTag(16, deviceFragment.getNextAlarmClock()) + ProtoAdapter.INT32.encodedSizeWithTag(15, deviceFragment.getTimezone()) + protoAdapter.encodedSizeWithTag(14, deviceFragment.getRegionCode()) + protoAdapter.asRepeated().encodedSizeWithTag(13, deviceFragment.getLocaleDisplayLanguage()) + protoAdapter.encodedSizeWithTag(12, deviceFragment.getLanguageCode()) + protoAdapter.encodedSizeWithTag(11, deviceFragment.getGsfId()) + protoAdapter.encodedSizeWithTag(10, deviceFragment.getDeviceId()) + protoAdapter.encodedSizeWithTag(9, deviceFragment.getDrmId()) + protoAdapter.encodedSizeWithTag(8, deviceFragment.getAdvertisingId()) + protoAdapter.encodedSizeWithTag(7, deviceFragment.getApiLevel()) + protoAdapter.encodedSizeWithTag(6, deviceFragment.getOsVersion()) + protoAdapter.encodedSizeWithTag(5, deviceFragment.getProductName()) + protoAdapter.encodedSizeWithTag(4, deviceFragment.getBrand()) + protoAdapter.encodedSizeWithTag(3, deviceFragment.getModel()) + protoAdapter.encodedSizeWithTag(2, deviceFragment.getName()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceFragment deviceFragment = (DeviceFragment) obj;
        kotlin.jvm.internal.j.g(deviceFragment, numX49.tnTj78("bd5bF"));
        ExtractionDetails extractionDetails = deviceFragment.getExtractionDetails();
        return deviceFragment.copy((131070 & 1) != 0 ? deviceFragment.extractionDetails : extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, (131070 & 2) != 0 ? deviceFragment.name : null, (131070 & 4) != 0 ? deviceFragment.model : null, (131070 & 8) != 0 ? deviceFragment.brand : null, (131070 & 16) != 0 ? deviceFragment.productName : null, (131070 & 32) != 0 ? deviceFragment.osVersion : null, (131070 & 64) != 0 ? deviceFragment.apiLevel : null, (131070 & 128) != 0 ? deviceFragment.advertisingId : null, (131070 & 256) != 0 ? deviceFragment.drmId : null, (131070 & 512) != 0 ? deviceFragment.deviceId : null, (131070 & 1024) != 0 ? deviceFragment.gsfId : null, (131070 & 2048) != 0 ? deviceFragment.languageCode : null, (131070 & 4096) != 0 ? deviceFragment.localeDisplayLanguage : null, (131070 & 8192) != 0 ? deviceFragment.regionCode : null, (131070 & 16384) != 0 ? deviceFragment.timezone : null, (131070 & 32768) != 0 ? deviceFragment.nextAlarmClock : null, (131070 & 65536) != 0 ? deviceFragment.enabledAccessibilityServices : null, (131070 & 131072) != 0 ? deviceFragment.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        DeviceFragment deviceFragment = (DeviceFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bd"));
        kotlin.jvm.internal.j.g(deviceFragment, numX49.tnTj78("bd5bi"));
        reverseProtoWriter.writeBytes(deviceFragment.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 17, deviceFragment.getEnabledAccessibilityServices());
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, deviceFragment.getNextAlarmClock());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 15, deviceFragment.getTimezone());
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, deviceFragment.getRegionCode());
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 13, deviceFragment.getLocaleDisplayLanguage());
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, deviceFragment.getLanguageCode());
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, deviceFragment.getGsfId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, deviceFragment.getDeviceId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, deviceFragment.getDrmId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, deviceFragment.getAdvertisingId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, deviceFragment.getApiLevel());
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, deviceFragment.getOsVersion());
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, deviceFragment.getProductName());
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deviceFragment.getBrand());
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deviceFragment.getModel());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, deviceFragment.getName());
        if (deviceFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, deviceFragment.getExtractionDetails());
        }
    }
}
