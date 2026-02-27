package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2263t extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        String strDecode5 = null;
        String strDecode6 = null;
        String strDecode7 = null;
        String strDecode8 = null;
        String strDecode9 = "";
        String strDecode10 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new CollectorDetails(strDecode, strDecode10, strDecode2, strDecode3, strDecode4, strDecode5, arrayListJ, strDecode9, strDecode6, strDecode7, strDecode8, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
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
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 8:
                    strDecode9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    strDecode7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    strDecode8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        CollectorDetails value = (CollectorDetails) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getCustomer_id());
        protoAdapter.encodeWithTag(writer, 2, value.getTransaction_id());
        protoAdapter.encodeWithTag(writer, 3, value.getTriggered_by());
        protoAdapter.encodeWithTag(writer, 4, value.getEvent_trigger());
        protoAdapter.encodeWithTag(writer, 5, value.getDate_time_collected());
        protoAdapter.encodeWithTag(writer, 6, value.getConfigurations());
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getAllowed_permissions());
        if (!j.b(value.getPlatform(), "")) {
            protoAdapter.encodeWithTag(writer, 8, value.getPlatform());
        }
        protoAdapter.encodeWithTag(writer, 9, value.getDevice_session_id());
        protoAdapter.encodeWithTag(writer, 10, value.getApplication_id());
        protoAdapter.encodeWithTag(writer, 11, value.getApp_install_id());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectorDetails value = (CollectorDetails) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(7, value.getAllowed_permissions()) + protoAdapter.encodedSizeWithTag(6, value.getConfigurations()) + protoAdapter.encodedSizeWithTag(5, value.getDate_time_collected()) + protoAdapter.encodedSizeWithTag(4, value.getEvent_trigger()) + protoAdapter.encodedSizeWithTag(3, value.getTriggered_by()) + protoAdapter.encodedSizeWithTag(2, value.getTransaction_id()) + protoAdapter.encodedSizeWithTag(1, value.getCustomer_id()) + size;
        if (!j.b(value.getPlatform(), "")) {
            iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getPlatform());
        }
        return protoAdapter.encodedSizeWithTag(11, value.getApp_install_id()) + protoAdapter.encodedSizeWithTag(10, value.getApplication_id()) + protoAdapter.encodedSizeWithTag(9, value.getDevice_session_id()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectorDetails value = (CollectorDetails) obj;
        j.g(value, "value");
        return CollectorDetails.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2047, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        CollectorDetails value = (CollectorDetails) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 11, value.getApp_install_id());
        protoAdapter.encodeWithTag(writer, 10, value.getApplication_id());
        protoAdapter.encodeWithTag(writer, 9, value.getDevice_session_id());
        if (!j.b(value.getPlatform(), "")) {
            protoAdapter.encodeWithTag(writer, 8, value.getPlatform());
        }
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getAllowed_permissions());
        protoAdapter.encodeWithTag(writer, 6, value.getConfigurations());
        protoAdapter.encodeWithTag(writer, 5, value.getDate_time_collected());
        protoAdapter.encodeWithTag(writer, 4, value.getEvent_trigger());
        protoAdapter.encodeWithTag(writer, 3, value.getTriggered_by());
        protoAdapter.encodeWithTag(writer, 2, value.getTransaction_id());
        protoAdapter.encodeWithTag(writer, 1, value.getCustomer_id());
    }
}
