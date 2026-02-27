package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class N extends ProtoAdapter {
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
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new InstalledApplication(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, arrayListJ, arrayList, boolDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 8:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        InstalledApplication value = (InstalledApplication) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getApplication_id());
        protoAdapter.encodeWithTag(writer, 2, value.getDescription());
        protoAdapter.encodeWithTag(writer, 3, value.getCategory());
        protoAdapter.encodeWithTag(writer, 4, value.getFirst_installed());
        protoAdapter.encodeWithTag(writer, 5, value.getLast_updated());
        protoAdapter.asRepeated().encodeWithTag(writer, 6, value.getPermissions());
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getFeatures());
        ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.isSystem());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstalledApplication value = (InstalledApplication) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, value.isSystem()) + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getFeatures()) + protoAdapter.asRepeated().encodedSizeWithTag(6, value.getPermissions()) + protoAdapter.encodedSizeWithTag(5, value.getLast_updated()) + protoAdapter.encodedSizeWithTag(4, value.getFirst_installed()) + protoAdapter.encodedSizeWithTag(3, value.getCategory()) + protoAdapter.encodedSizeWithTag(2, value.getDescription()) + protoAdapter.encodedSizeWithTag(1, value.getApplication_id()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstalledApplication value = (InstalledApplication) obj;
        j.g(value, "value");
        return InstalledApplication.copy$default(value, null, null, null, null, null, null, null, null, ByteString.EMPTY, 255, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        InstalledApplication value = (InstalledApplication) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.isSystem());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 7, value.getFeatures());
        protoAdapter.asRepeated().encodeWithTag(writer, 6, value.getPermissions());
        protoAdapter.encodeWithTag(writer, 5, value.getLast_updated());
        protoAdapter.encodeWithTag(writer, 4, value.getFirst_installed());
        protoAdapter.encodeWithTag(writer, 3, value.getCategory());
        protoAdapter.encodeWithTag(writer, 2, value.getDescription());
        protoAdapter.encodeWithTag(writer, 1, value.getApplication_id());
    }
}
