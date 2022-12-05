import { Component, OnInit } from '@angular/core';
import { TabletService } from '../tablet.service';
import { Tablet } from '../tablet';
@Component({
  selector: 'app-tablet',
  templateUrl: './tablet.component.html',
  styleUrls: ['./tablet.component.css']
})
export class TabletComponent implements OnInit {
  tablet:Tablet=new Tablet()

constructor(private tabletservice:TabletService) { }
  ngOnInit(): void {
  }
  userTablet(){
  console.log(this.tablet)
  this.tabletservice.tabletUser(this.tablet).subscribe(data=>
    {
      alert("Successfully User is buy the product!!!")

    },error=>alert("sorry user cannot buy the product!!!"));
    

}
}
