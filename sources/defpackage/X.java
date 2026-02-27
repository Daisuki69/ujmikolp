package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class X extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        Dimension dimensionDecode = null;
        String strDecode4 = null;
        String strDecode5 = null;
        String strDecode6 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Media(strDecode, strDecode2, strDecode3, dimensionDecode, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 2:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    dimensionDecode = Dimension.ADAPTER.decode(reader);
                    break;
                case 5:
                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 6:
                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 7:
                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                    break;
                default:
                    reader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Media value = (Media) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getFile_name());
        protoAdapter.encodeWithTag(writer, 2, value.getContent_type());
        protoAdapter.encodeWithTag(writer, 3, value.getSize());
        Dimension.ADAPTER.encodeWithTag(writer, 4, value.getDimension());
        protoAdapter.encodeWithTag(writer, 5, value.getCreated_date());
        protoAdapter.encodeWithTag(writer, 6, value.getPath());
        protoAdapter.encodeWithTag(writer, 7, value.getVolume_name());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Media value = (Media) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, value.getVolume_name()) + protoAdapter.encodedSizeWithTag(6, value.getPath()) + protoAdapter.encodedSizeWithTag(5, value.getCreated_date()) + Dimension.ADAPTER.encodedSizeWithTag(4, value.getDimension()) + protoAdapter.encodedSizeWithTag(3, value.getSize()) + protoAdapter.encodedSizeWithTag(2, value.getContent_type()) + protoAdapter.encodedSizeWithTag(1, value.getFile_name()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Media value = (Media) obj;
        j.g(value, "value");
        Dimension dimension = value.getDimension();
        return Media.copy$default(value, null, null, null, dimension != null ? Dimension.ADAPTER.redact(dimension) : null, null, null, null, ByteString.EMPTY, 119, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Media value = (Media) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 7, value.getVolume_name());
        protoAdapter.encodeWithTag(writer, 6, value.getPath());
        protoAdapter.encodeWithTag(writer, 5, value.getCreated_date());
        Dimension.ADAPTER.encodeWithTag(writer, 4, value.getDimension());
        protoAdapter.encodeWithTag(writer, 3, value.getSize());
        protoAdapter.encodeWithTag(writer, 2, value.getContent_type());
        protoAdapter.encodeWithTag(writer, 1, value.getFile_name());
    }
}
