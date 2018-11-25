package _3_generics;

public class App2_object_holder {
    public static void main(String[] args) {
        ObjectHolder holder = new ObjectHolder();
        holder.setData("value");
        String stringData = (String) holder.getData();
    }
}

class ObjectHolder {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
