package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.RiskIntelligenceFragment;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5bH"));
        long jBeginMessage = protoReader.beginMessage();
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        Boolean boolDecode4 = null;
        Boolean boolDecode5 = null;
        Boolean boolDecode6 = null;
        Boolean boolDecode7 = null;
        Boolean boolDecode8 = null;
        Boolean boolDecode9 = null;
        Boolean boolDecode10 = null;
        Boolean boolDecode11 = null;
        Boolean boolDecode12 = null;
        Boolean boolDecode13 = null;
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            Boolean bool = boolDecode;
            if (iNextTag == -1) {
                return new RiskIntelligenceFragment(extractionDetailsDecode, bool, boolDecode2, boolDecode3, boolDecode4, boolDecode5, boolDecode6, boolDecode7, boolDecode8, boolDecode9, boolDecode10, boolDecode11, boolDecode12, boolDecode13, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 3:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    boolDecode4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    boolDecode5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    boolDecode6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    boolDecode7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    boolDecode8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    boolDecode9 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 11:
                    boolDecode10 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 12:
                    boolDecode11 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 13:
                    boolDecode12 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 14:
                    boolDecode13 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
            boolDecode = bool;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        RiskIntelligenceFragment riskIntelligenceFragment = (RiskIntelligenceFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bO"));
        kotlin.jvm.internal.j.g(riskIntelligenceFragment, numX49.tnTj78("bd5bQ"));
        if (riskIntelligenceFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, riskIntelligenceFragment.getExtractionDetails());
        }
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, riskIntelligenceFragment.isBluetoothOn());
        protoAdapter.encodeWithTag(protoWriter, 3, riskIntelligenceFragment.isDebuggerAttached());
        protoAdapter.encodeWithTag(protoWriter, 4, riskIntelligenceFragment.isDeveloperModeEnabled());
        protoAdapter.encodeWithTag(protoWriter, 5, riskIntelligenceFragment.isBiometricsEnrolled());
        protoAdapter.encodeWithTag(protoWriter, 6, riskIntelligenceFragment.isLocationEnabled());
        protoAdapter.encodeWithTag(protoWriter, 7, riskIntelligenceFragment.isDataRoamingEnabled());
        protoAdapter.encodeWithTag(protoWriter, 8, riskIntelligenceFragment.isRooted());
        protoAdapter.encodeWithTag(protoWriter, 9, riskIntelligenceFragment.isSystemUser());
        protoAdapter.encodeWithTag(protoWriter, 10, riskIntelligenceFragment.isUsbDebuggingEnabled());
        protoAdapter.encodeWithTag(protoWriter, 11, riskIntelligenceFragment.isVirtual());
        protoAdapter.encodeWithTag(protoWriter, 12, riskIntelligenceFragment.isVpnConnected());
        protoAdapter.encodeWithTag(protoWriter, 13, riskIntelligenceFragment.isWifiDebuggingEnabled());
        protoAdapter.encodeWithTag(protoWriter, 14, riskIntelligenceFragment.isWifiEnabled());
        protoWriter.writeBytes(riskIntelligenceFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RiskIntelligenceFragment riskIntelligenceFragment = (RiskIntelligenceFragment) obj;
        kotlin.jvm.internal.j.g(riskIntelligenceFragment, numX49.tnTj78("bd5be"));
        int size = riskIntelligenceFragment.unknownFields().size();
        if (riskIntelligenceFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, riskIntelligenceFragment.getExtractionDetails());
        }
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(14, riskIntelligenceFragment.isWifiEnabled()) + protoAdapter.encodedSizeWithTag(13, riskIntelligenceFragment.isWifiDebuggingEnabled()) + protoAdapter.encodedSizeWithTag(12, riskIntelligenceFragment.isVpnConnected()) + protoAdapter.encodedSizeWithTag(11, riskIntelligenceFragment.isVirtual()) + protoAdapter.encodedSizeWithTag(10, riskIntelligenceFragment.isUsbDebuggingEnabled()) + protoAdapter.encodedSizeWithTag(9, riskIntelligenceFragment.isSystemUser()) + protoAdapter.encodedSizeWithTag(8, riskIntelligenceFragment.isRooted()) + protoAdapter.encodedSizeWithTag(7, riskIntelligenceFragment.isDataRoamingEnabled()) + protoAdapter.encodedSizeWithTag(6, riskIntelligenceFragment.isLocationEnabled()) + protoAdapter.encodedSizeWithTag(5, riskIntelligenceFragment.isBiometricsEnrolled()) + protoAdapter.encodedSizeWithTag(4, riskIntelligenceFragment.isDeveloperModeEnabled()) + protoAdapter.encodedSizeWithTag(3, riskIntelligenceFragment.isDebuggerAttached()) + protoAdapter.encodedSizeWithTag(2, riskIntelligenceFragment.isBluetoothOn()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RiskIntelligenceFragment riskIntelligenceFragment = (RiskIntelligenceFragment) obj;
        kotlin.jvm.internal.j.g(riskIntelligenceFragment, numX49.tnTj78("bd5b8"));
        ExtractionDetails extractionDetails = riskIntelligenceFragment.getExtractionDetails();
        return riskIntelligenceFragment.copy((16382 & 1) != 0 ? riskIntelligenceFragment.extractionDetails : extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, (16382 & 2) != 0 ? riskIntelligenceFragment.isBluetoothOn : null, (16382 & 4) != 0 ? riskIntelligenceFragment.isDebuggerAttached : null, (16382 & 8) != 0 ? riskIntelligenceFragment.isDeveloperModeEnabled : null, (16382 & 16) != 0 ? riskIntelligenceFragment.isBiometricsEnrolled : null, (16382 & 32) != 0 ? riskIntelligenceFragment.isLocationEnabled : null, (16382 & 64) != 0 ? riskIntelligenceFragment.isDataRoamingEnabled : null, (16382 & 128) != 0 ? riskIntelligenceFragment.isRooted : null, (16382 & 256) != 0 ? riskIntelligenceFragment.isSystemUser : null, (16382 & 512) != 0 ? riskIntelligenceFragment.isUsbDebuggingEnabled : null, (16382 & 1024) != 0 ? riskIntelligenceFragment.isVirtual : null, (16382 & 2048) != 0 ? riskIntelligenceFragment.isVpnConnected : null, (16382 & 4096) != 0 ? riskIntelligenceFragment.isWifiDebuggingEnabled : null, (16382 & 8192) != 0 ? riskIntelligenceFragment.isWifiEnabled : null, (16382 & 16384) != 0 ? riskIntelligenceFragment.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        RiskIntelligenceFragment riskIntelligenceFragment = (RiskIntelligenceFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bt"));
        kotlin.jvm.internal.j.g(riskIntelligenceFragment, numX49.tnTj78("bd5bU"));
        reverseProtoWriter.writeBytes(riskIntelligenceFragment.unknownFields());
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, riskIntelligenceFragment.isWifiEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, riskIntelligenceFragment.isWifiDebuggingEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, riskIntelligenceFragment.isVpnConnected());
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, riskIntelligenceFragment.isVirtual());
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, riskIntelligenceFragment.isUsbDebuggingEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, riskIntelligenceFragment.isSystemUser());
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, riskIntelligenceFragment.isRooted());
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, riskIntelligenceFragment.isDataRoamingEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, riskIntelligenceFragment.isLocationEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, riskIntelligenceFragment.isBiometricsEnrolled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, riskIntelligenceFragment.isDeveloperModeEnabled());
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, riskIntelligenceFragment.isDebuggerAttached());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, riskIntelligenceFragment.isBluetoothOn());
        if (riskIntelligenceFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, riskIntelligenceFragment.getExtractionDetails());
        }
    }
}
