import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PensionerDetail } from '../model/PensionerDetail';
import { Service } from '../policy-service/service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  consumerBusinessCreate: string | any;
  consumerBusinessUpdate: string | any;
  businessPropertyCreate: string | any;
  businessPropertyUpdate: string | any;
  details:PensionerDetail[]=[];
  constructor(private service:Service, private router:Router) { }

  ngOnInit() {
  }
  pensionerDetails() {
     // this.router.navigateByUrl('/pensionerDetails');
      this.service.pensionerDetails().subscribe(data=>{
        this.router.navigate(["/pensionerDetails"]);
        });
   
};
pensionDisbursement() {
  this.router.navigateByUrl('/pensionDisbursement');
};
pensionDetail () {
  this.router.navigateByUrl('/pensionDetail');
};
processPension() {
  this.router.navigateByUrl('/processPension');
};
pensionerByAaadhar() {
  this.router.navigateByUrl('/pensionerByAaadhar');
  
};
logout(){
  this.router.navigateByUrl('/login')
};
  
}  
