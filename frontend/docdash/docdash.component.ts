import { Component } from '@angular/core';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-docdash',
  templateUrl: './docdash.component.html',
  styleUrl: './docdash.component.css'
})
export class DocdashComponent {

  
  searchText: string="";
  constructor(private patientService:PatientService ,private router:Router){}

  patients:Patient[]=[];

  ngOnInit():void{
    this.getPatients();
  }

  

  getPatients(){
  this.patientService.getPatientList().subscribe(data=>{
    this.patients=data;
  })
}

update(id:number){

  this.router.navigate(['update-patient',id])

}

delete(id:number){
  this.patientService.delete(id).subscribe(data=>{
    console.log(data);
    this.getPatients();
  })
} 

view(id:number){
  this.router.navigate(['view-patient',id]);

}



searchPatients() {
  if (this.searchText.trim() === '') {
    // If the search text is empty, reset to the original patient list
    this.getPatients();
  } else {
    // Filter patients based on the search text
    this.patients = this.patients.filter(patient =>
      patient.name.toLowerCase().includes(this.searchText.toLowerCase())
    );
  }
}

logout(){
  //this.docauth.logout();
  this.router.navigate(['home'])
}


}
