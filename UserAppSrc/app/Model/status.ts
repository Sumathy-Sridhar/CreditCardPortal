export class Status
{
    private referncenumber!:string;
    private statusupdate!:string;

    constructor(referncenumber:string,statusupdate:string)
    {
        this.referncenumber=referncenumber;
        this.statusupdate=statusupdate;
    }
}
