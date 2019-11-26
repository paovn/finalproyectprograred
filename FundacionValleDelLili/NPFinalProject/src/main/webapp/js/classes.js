class Doctor{

    constructor(cc,name,lastname,age,phone,email,password){
        this.id = 0;
        this.cc = cc;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.password = password;
        Object.seal();
    }

    constructor(id,cc,name,lastname,age,phone,email,password){
        this.id = id;
        this.cc = cc;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.password = password;
        Object.seal();
    }

    toJson(){
        return JSON.stringify(this);
    }


}

class Patient{

    


}