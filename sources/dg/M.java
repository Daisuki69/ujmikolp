package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.MetadataFragment;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd52P"));
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
        while (true) {
            int iNextTag = protoReader.nextTag();
            String str = strDecode;
            if (iNextTag == -1) {
                return new MetadataFragment(arrayListJ, strDecode12, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 2:
                    strDecode12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    strDecode8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    strDecode9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    strDecode10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 13:
                    strDecode11 = ProtoAdapter.STRING.decode(protoReader);
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
        MetadataFragment metadataFragment = (MetadataFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd52b"));
        kotlin.jvm.internal.j.g(metadataFragment, numX49.tnTj78("bd522"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, metadataFragment.getAllowedPermissions());
        protoAdapter.encodeWithTag(protoWriter, 2, metadataFragment.getDeviceSessionId());
        protoAdapter.encodeWithTag(protoWriter, 3, metadataFragment.getExtractionId());
        protoAdapter.encodeWithTag(protoWriter, 4, metadataFragment.getCustomerId());
        protoAdapter.encodeWithTag(protoWriter, 5, metadataFragment.getSdkVersion());
        protoAdapter.encodeWithTag(protoWriter, 6, metadataFragment.getSchemaVersion());
        protoAdapter.encodeWithTag(protoWriter, 7, metadataFragment.getPlatform());
        protoAdapter.encodeWithTag(protoWriter, 8, metadataFragment.getEventTrigger());
        protoAdapter.encodeWithTag(protoWriter, 9, metadataFragment.getDateTimeExtracted());
        protoAdapter.encodeWithTag(protoWriter, 10, metadataFragment.getAppInstallId());
        protoAdapter.encodeWithTag(protoWriter, 11, metadataFragment.getTransactionId());
        protoAdapter.encodeWithTag(protoWriter, 12, metadataFragment.getTriggeredBy());
        protoAdapter.encodeWithTag(protoWriter, 13, metadataFragment.getApplicationId());
        protoWriter.writeBytes(metadataFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MetadataFragment metadataFragment = (MetadataFragment) obj;
        kotlin.jvm.internal.j.g(metadataFragment, numX49.tnTj78("bd52Z"));
        int size = metadataFragment.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(13, metadataFragment.getApplicationId()) + protoAdapter.encodedSizeWithTag(12, metadataFragment.getTriggeredBy()) + protoAdapter.encodedSizeWithTag(11, metadataFragment.getTransactionId()) + protoAdapter.encodedSizeWithTag(10, metadataFragment.getAppInstallId()) + protoAdapter.encodedSizeWithTag(9, metadataFragment.getDateTimeExtracted()) + protoAdapter.encodedSizeWithTag(8, metadataFragment.getEventTrigger()) + protoAdapter.encodedSizeWithTag(7, metadataFragment.getPlatform()) + protoAdapter.encodedSizeWithTag(6, metadataFragment.getSchemaVersion()) + protoAdapter.encodedSizeWithTag(5, metadataFragment.getSdkVersion()) + protoAdapter.encodedSizeWithTag(4, metadataFragment.getCustomerId()) + protoAdapter.encodedSizeWithTag(3, metadataFragment.getExtractionId()) + protoAdapter.encodedSizeWithTag(2, metadataFragment.getDeviceSessionId()) + protoAdapter.asRepeated().encodedSizeWithTag(1, metadataFragment.getAllowedPermissions()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MetadataFragment metadataFragment = (MetadataFragment) obj;
        kotlin.jvm.internal.j.g(metadataFragment, numX49.tnTj78("bd52k"));
        return metadataFragment.copy((8191 & 1) != 0 ? metadataFragment.allowedPermissions : null, (8191 & 2) != 0 ? metadataFragment.deviceSessionId : null, (8191 & 4) != 0 ? metadataFragment.extractionId : null, (8191 & 8) != 0 ? metadataFragment.customerId : null, (8191 & 16) != 0 ? metadataFragment.sdkVersion : null, (8191 & 32) != 0 ? metadataFragment.schemaVersion : null, (8191 & 64) != 0 ? metadataFragment.platform : null, (8191 & 128) != 0 ? metadataFragment.eventTrigger : null, (8191 & 256) != 0 ? metadataFragment.dateTimeExtracted : null, (8191 & 512) != 0 ? metadataFragment.appInstallId : null, (8191 & 1024) != 0 ? metadataFragment.transactionId : null, (8191 & 2048) != 0 ? metadataFragment.triggeredBy : null, (8191 & 4096) != 0 ? metadataFragment.applicationId : null, (8191 & 8192) != 0 ? metadataFragment.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        MetadataFragment metadataFragment = (MetadataFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd52L"));
        kotlin.jvm.internal.j.g(metadataFragment, numX49.tnTj78("bd52r"));
        reverseProtoWriter.writeBytes(metadataFragment.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, metadataFragment.getApplicationId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, metadataFragment.getTriggeredBy());
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, metadataFragment.getTransactionId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, metadataFragment.getAppInstallId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, metadataFragment.getDateTimeExtracted());
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, metadataFragment.getEventTrigger());
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, metadataFragment.getPlatform());
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, metadataFragment.getSchemaVersion());
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, metadataFragment.getSdkVersion());
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, metadataFragment.getCustomerId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, metadataFragment.getExtractionId());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, metadataFragment.getDeviceSessionId());
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, metadataFragment.getAllowedPermissions());
    }
}
