package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2442x extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        ByteString byteStringDecode = ByteString.EMPTY;
        long jBeginMessage = reader.beginMessage();
        ByteString byteStringDecode2 = byteStringDecode;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new CrashDetail(byteStringDecode, byteStringDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
            } else if (iNextTag != 2) {
                reader.readUnknownField(iNextTag);
            } else {
                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        CrashDetail value = (CrashDetail) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ByteString name = value.getName();
        ByteString byteString = ByteString.EMPTY;
        if (!j.b(name, byteString)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getName());
        }
        if (!j.b(value.getData_(), byteString)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CrashDetail value = (CrashDetail) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ByteString name = value.getName();
        ByteString byteString = ByteString.EMPTY;
        if (!j.b(name, byteString)) {
            size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getName());
        }
        return !j.b(value.getData_(), byteString) ? ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getData_()) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CrashDetail value = (CrashDetail) obj;
        j.g(value, "value");
        return CrashDetail.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        CrashDetail value = (CrashDetail) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ByteString data_ = value.getData_();
        ByteString byteString = ByteString.EMPTY;
        if (!j.b(data_, byteString)) {
            ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
        }
        if (j.b(value.getName(), byteString)) {
            return;
        }
        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getName());
    }
}
