package fun.pxyc.onelogger.utils;

import java.util.Map;
import java.util.Set;

public class TypeSafeMap {
    private final Map<String, Object> body;

    public TypeSafeMap(Map<String, Object> body) {
        this.body = body;
    }

    public Map<String, Object> get() {
        return this.body;
    }

    public boolean contains(String name) {
        return this.body.containsKey(name);
    }

    public void remove(String name) {
        this.body.remove(name);
    }

    public Set<String> keySet() {
        return this.body.keySet();
    }

    public String stringValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToString(v);
    }

    public String stringValue(String name, String defaultValue) {
        String v = this.stringValue(name);
        return v == null ? defaultValue : v;
    }

    public String notNullString(String name) {
        String v = this.stringValue(name);
        return v == null ? "" : v;
    }

    public String notNullString(String name, String defaultValue) {
        String v = this.stringValue(name);
        return v != null && !v.equals("") ? v : defaultValue;
    }

    public int intValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToInt(v);
    }

    public int intValue(String name, int defaultValue) {
        Object v = this.body.get(name);
        return TypeSafe.anyToInt(v, defaultValue);
    }

    public long longValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToLong(v);
    }

    public long longValue(String name, long defaultValue) {
        Object v = this.body.get(name);
        return TypeSafe.anyToLong(v, defaultValue);
    }

    public double doubleValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToDouble(v);
    }

    public double doubleValue(String name, double defaultValue) {
        Object v = this.body.get(name);
        return TypeSafe.anyToDouble(v, defaultValue);
    }

    public boolean boolValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToBool(v);
    }

    public boolean boolValue(String name, boolean defaultValue) {
        Object v = this.body.get(name);
        return TypeSafe.anyToBool(v, defaultValue);
    }

    public Map<String, Object> mapValue(String name) {
        Object v = this.body.get(name);
        return TypeSafe.anyToMap(v);
    }
}
