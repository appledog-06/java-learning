class Teacher extends Employee{
    private int numsubject;
    public Teacher(String name,String post,int monthlysalary,int numsubject){
        super(name,post,monthlysalary);
        this.numsubject=numsubject;
    }
    public long getYearlySalary() {
        return super.getYearlySalary() + 1000 * this.numsubject;
    }
    public String getDetail(){
        String detail=super.getDetail()+"number of subjects: "+this.numsubject+this.getYearlySalary();
        return detail;

    }
}
