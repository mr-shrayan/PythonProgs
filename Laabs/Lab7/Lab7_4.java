/*Calculate child height from his fathers and mothers height. Use
Interface. (Average)*/

interface Father {
    float f_ht = 6.2f;

    void height();
}

interface Mother {
    float m_ht = 5.5f;

    void height();
}

class Child implements Father, Mother {
    public void height() {
        float c_ht = (f_ht + m_ht) / 2.0f;
        System.out.print("Height of child is " + c_ht);
    }
}

class Lab7_4 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.height();
    }
}
