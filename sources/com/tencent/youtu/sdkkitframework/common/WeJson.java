package com.tencent.youtu.sdkkitframework.common;

import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class WeJson {
    public static final String EMPTY_ARR = "[]";
    public static final String EMPTY_MAP = "{}";

    private <T> T fromArr(JSONArray jSONArray, Class<T> cls) {
        Class<?> componentType = cls.getComponentType();
        T t5 = (T) Array.newInstance(componentType, jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Array.set(t5, i, fromJsonData(getObject(jSONArray, i), componentType, componentType));
        }
        return t5;
    }

    private <T> T fromJsonArr(JSONArray jSONArray, Class<T> cls, Class<?> cls2) throws WeJsonException {
        if (cls.equals(List.class)) {
            return (T) fromList(jSONArray, cls, cls2);
        }
        if (cls.isArray()) {
            return (T) fromArr(jSONArray, cls);
        }
        throw new WeJsonException("json 解析错误:不支持的类型:".concat(cls.getName()));
    }

    private Object fromJsonData(Object obj, Class<?> cls, Class<?> cls2) {
        return obj instanceof JSONArray ? fromJsonArr((JSONArray) obj, cls, cls2) : obj instanceof JSONObject ? fromJsonObj((JSONObject) obj, cls, cls2) : obj;
    }

    private <T> T fromJsonObj(JSONObject jSONObject, Class<T> cls, Class<?> cls2) {
        return cls.equals(Map.class) ? (T) fromMap(jSONObject, cls, cls2) : (T) fromPojo(jSONObject, cls);
    }

    private List fromList(JSONArray jSONArray, Class<List> cls, Class<?> cls2) throws WeJsonException {
        List listNewInstance;
        if (cls2 == null) {
            throw new WeJsonException("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.List")) {
            listNewInstance = new ArrayList();
        } else {
            try {
                listNewInstance = cls.newInstance();
            } catch (Exception e) {
                throw new WeJsonException("创建List类型失败,该列表不支持无参实例化", e);
            }
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object object = getObject(jSONArray, i);
            if (object instanceof JSONArray) {
                listNewInstance.add(fromJsonArr((JSONArray) object, cls, cls2));
            } else if (object instanceof JSONObject) {
                listNewInstance.add(fromJsonObj((JSONObject) object, cls, cls2));
            } else {
                listNewInstance.add(object);
            }
        }
        return listNewInstance;
    }

    private Map fromMap(JSONObject jSONObject, Class<Map> cls, Class<?> cls2) throws WeJsonException {
        Map mapNewInstance;
        if (cls2 == null) {
            throw new WeJsonException("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.Map")) {
            mapNewInstance = new HashMap();
        } else {
            try {
                mapNewInstance = cls.newInstance();
            } catch (Exception e) {
                throw new WeJsonException("创建Map类型失败,该Map不支持无参实例化", e);
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object object = getObject(jSONObject, next);
            if (object != null) {
                mapNewInstance.put(next, fromJsonData(object, cls, cls2));
            } else {
                mapNewInstance.put(next, null);
            }
        }
        return mapNewInstance;
    }

    private <T> T fromPojo(JSONObject jSONObject, Class<T> cls) throws WeJsonException {
        Field[] declaredFields = cls.getDeclaredFields();
        Class<? super T> superclass = cls.getSuperclass();
        Field[] declaredFields2 = new Field[0];
        if (superclass != null) {
            declaredFields2 = superclass.getDeclaredFields();
        }
        int length = declaredFields.length + declaredFields2.length;
        Field[] fieldArr = new Field[length];
        for (int i = 0; i < declaredFields.length; i++) {
            fieldArr[i] = declaredFields[i];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            return null;
        }
        try {
            T tNewInstance = cls.newInstance();
            for (int i4 = 0; i4 < length; i4++) {
                Field field = fieldArr[i4];
                String name = field.getName();
                if (!name.contains("$")) {
                    int modifiers = field.getModifiers();
                    Object objOpt = jSONObject.opt(name);
                    if (objOpt == null) {
                        continue;
                    } else {
                        Object objFromJsonData = fromJsonData(objOpt, getMemberType(cls, field), getSubType(cls, field, objOpt));
                        if (JSONObject.NULL.equals(objFromJsonData)) {
                            objFromJsonData = null;
                        }
                        if ((modifiers & 1) != 0) {
                            try {
                                field.set(tNewInstance, objFromJsonData);
                            } catch (IllegalAccessException e) {
                                throw new WeJsonException("设置成员变量值失败.", e);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("set");
                            sb2.append(name.substring(0, 1).toUpperCase());
                            sb2.append(name.length() == 1 ? "" : name.substring(1));
                            try {
                                try {
                                    cls.getMethod(sb2.toString(), field.getType()).invoke(tNewInstance, objFromJsonData);
                                } catch (Exception e7) {
                                    throw new WeJsonException("调用set方法失败.", e7);
                                }
                            } catch (NoSuchMethodException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            }
            return tNewInstance;
        } catch (Exception e11) {
            throw new WeJsonException("必须为该类型提供一个无参构造方法:".concat(cls.getName()), e11);
        }
    }

    private <T> Class<?> getMemberType(Class<T> cls, Field field) throws WeJsonException {
        if (!(field.getGenericType() instanceof TypeVariable)) {
            return field.getType();
        }
        cls.getTypeParameters();
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            throw new WeJsonException(a.g(cls, "缺少泛型信息:"));
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        if (type instanceof Class) {
            return (Class) type;
        }
        throw new WeJsonException("不支持嵌套泛型");
    }

    private Object getObject(JSONArray jSONArray, int i) throws WeJsonException {
        try {
            return jSONArray.get(i);
        } catch (JSONException e) {
            throw new WeJsonException("JSONArray.get() cause JSONException", e);
        }
    }

    private <T> Class<?> getSubType(Class<T> cls, Field field, Object obj) throws WeJsonException {
        if (field.getGenericType() instanceof TypeVariable) {
            cls.getTypeParameters();
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                throw new WeJsonException(a.g(cls, "缺少泛型信息:"));
            }
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return (Class) type;
            }
            throw new WeJsonException("不支持嵌套泛型");
        }
        if (field.getType().equals(List.class)) {
            Type genericType = field.getGenericType();
            if (!(genericType instanceof ParameterizedType)) {
                throw new WeJsonException("缺少泛型类型声明:" + field.getName());
            }
            Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (Class) type2;
            }
            throw new WeJsonException("不支持嵌套泛型:" + field.getName());
        }
        if (!field.getType().equals(Map.class)) {
            return field.getType();
        }
        Type genericType2 = field.getGenericType();
        if (!(genericType2 instanceof ParameterizedType)) {
            throw new WeJsonException("缺少泛型类型声明:" + field.getName());
        }
        Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
        if (type3 instanceof Class) {
            return (Class) type3;
        }
        throw new WeJsonException("不支持嵌套泛型:" + field.getName());
    }

    private String getValidStr(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\b", "\\b").replace(Global.NEWLINE, "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t");
    }

    private <T> boolean isPrimitivePackageType(T t5) {
        return (t5 instanceof Integer) || (t5 instanceof Short) || (t5 instanceof Long) || (t5 instanceof Byte) || (t5 instanceof Boolean) || (t5 instanceof Float) || (t5 instanceof Double) || (t5 instanceof Character);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void process(StringBuilder sb2, T t5) {
        if (t5.getClass().isPrimitive()) {
            sb2.append(t5);
            return;
        }
        if (t5 instanceof String) {
            sb2.append('\"');
            sb2.append(getValidStr((String) t5));
            sb2.append('\"');
        } else {
            if (isPrimitivePackageType(t5)) {
                sb2.append(t5);
                return;
            }
            if (t5.getClass().isArray()) {
                processArr(sb2, (Object[]) t5);
                return;
            }
            if (t5 instanceof Iterable) {
                processIterable(sb2, (Iterable) t5);
            } else if (t5 instanceof Map) {
                processMap(sb2, (Map) t5);
            } else {
                processObj(sb2, t5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void processArr(StringBuilder sb2, Object[] objArr) {
        if (objArr.length == 0) {
            sb2.append("[]");
            return;
        }
        sb2.append('[');
        for (int i = 0; i < objArr.length; i++) {
            process(sb2, objArr[i]);
            if (i < objArr.length - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
    }

    private void processIterable(StringBuilder sb2, Iterable iterable) {
        Iterator it = iterable.iterator();
        sb2.append('[');
        int i = 0;
        while (it.hasNext()) {
            i++;
            process(sb2, it.next());
            sb2.append(',');
        }
        if (i > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        sb2.append(']');
    }

    private void processMap(StringBuilder sb2, Map<String, Object> map) {
        if (map.size() == 0) {
            sb2.append(EMPTY_MAP);
            return;
        }
        sb2.append('{');
        int size = map.size();
        int i = 0;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (key != null && !key.equals("") && value != null && (!(value instanceof String) || !entry.equals(""))) {
                sb2.append('\"');
                sb2.append(key);
                sb2.append('\"');
                sb2.append(':');
                process(sb2, value);
                if (i < size - 1) {
                    sb2.append(',');
                }
                i++;
            }
        }
        sb2.append('}');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void processObj(StringBuilder sb2, T t5) {
        Object objInvoke;
        Field[] declaredFields = t5.getClass().getDeclaredFields();
        Field[] declaredFields2 = t5.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length + declaredFields2.length;
        Field[] fieldArr = new Field[length];
        int i = 0;
        for (int i4 = 0; i4 < declaredFields.length; i4++) {
            fieldArr[i4] = declaredFields[i4];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            sb2.append(EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        int i6 = 0;
        while (true) {
            String strSubstring = "";
            if (i6 >= length) {
                break;
            }
            try {
                Field field = fieldArr[i6];
                int modifiers = field.getModifiers();
                if ((modifiers & 8) == 0) {
                    String name = field.getName();
                    if (!name.contains("$")) {
                        if ((modifiers & 1) != 0) {
                            Object obj = field.get(t5);
                            if (obj != null) {
                                map.put(name, obj);
                            }
                        } else {
                            Class<?> cls = t5.getClass();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("get");
                            sb3.append(name.substring(0, 1).toUpperCase());
                            if (name.length() != 1) {
                                strSubstring = name.substring(1);
                            }
                            sb3.append(strSubstring);
                            Method method = cls.getMethod(sb3.toString(), null);
                            if (method != null && (objInvoke = method.invoke(t5, null)) != null) {
                                map.put(name, objInvoke);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            i6++;
        }
        sb2.append('{');
        int size = map.size();
        for (Map.Entry entry : map.entrySet()) {
            i++;
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && value.equals("")) {
                if (str.equals("image")) {
                    value = "";
                }
            }
            sb2.append('\"');
            sb2.append(str);
            sb2.append('\"');
            sb2.append(':');
            process(sb2, value);
            if (i < size) {
                sb2.append(',');
            }
        }
        sb2.append('}');
    }

    public <T> T fromJson(String str, Class<T> cls) throws WeJsonException {
        if (str == null) {
            return null;
        }
        if (cls == null) {
            throw new WeJsonException("必须指定classOfT");
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[")) {
            try {
                T t5 = (T) fromJsonArr(new JSONArray(strTrim), cls, null);
                if (t5 != null) {
                    return t5;
                }
            } catch (Exception e) {
                throw new WeJsonException("json 解析错误" + e.getMessage(), e);
            }
        } else if (strTrim.startsWith("{")) {
            try {
                return (T) fromJsonObj(new JSONObject(strTrim), cls, null);
            } catch (Exception e7) {
                throw new WeJsonException("json 解析错误:" + e7.getMessage(), e7);
            }
        }
        throw new WeJsonException("classOfT 指定错误");
    }

    public <T> String toJson(T t5) {
        return toJson(t5, 0);
    }

    public <T> String toJson(T t5, int i) {
        if (t5 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        process(sb2, t5);
        return sb2.toString();
    }

    private Object getObject(JSONObject jSONObject, String str) throws WeJsonException {
        try {
            return jSONObject.get(str);
        } catch (JSONException e) {
            throw new WeJsonException("JSONObject.get() cause JSONException", e);
        }
    }
}
