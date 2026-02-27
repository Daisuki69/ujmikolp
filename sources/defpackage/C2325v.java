package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2325v extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Contact(boolDecode, boolDecode2, numDecode, numDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                boolDecode = ProtoAdapter.BOOL.decode(reader);
            } else if (iNextTag == 2) {
                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
            } else if (iNextTag == 3) {
                numDecode = ProtoAdapter.UINT32.decode(reader);
            } else if (iNextTag != 4) {
                reader.readUnknownField(iNextTag);
            } else {
                numDecode2 = ProtoAdapter.UINT32.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Contact value = (Contact) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(writer, 1, value.getHas_name());
        protoAdapter.encodeWithTag(writer, 2, value.getHas_photo());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(writer, 3, value.getPhone_number_count());
        protoAdapter2.encodeWithTag(writer, 4, value.getEmail_count());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Contact value = (Contact) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, value.getHas_photo()) + protoAdapter.encodedSizeWithTag(1, value.getHas_name()) + size;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
        return protoAdapter2.encodedSizeWithTag(4, value.getEmail_count()) + protoAdapter2.encodedSizeWithTag(3, value.getPhone_number_count()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Contact value = (Contact) obj;
        j.g(value, "value");
        return Contact.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Contact value = (Contact) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(writer, 4, value.getEmail_count());
        protoAdapter.encodeWithTag(writer, 3, value.getPhone_number_count());
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(writer, 2, value.getHas_photo());
        protoAdapter2.encodeWithTag(writer, 1, value.getHas_name());
    }
}
