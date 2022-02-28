import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  listAlreadyResults : Array<NumberConverted> =[];

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    console.log(inputNumber);
    this.gbsuFtbLaiService.convertNumber(inputNumber).subscribe(data => {
       const numberConverted = {
        numberToConvert : inputNumber,
        result:"and the result is " + data.result
       }
       this.listAlreadyResults.push(numberConverted);
       console.log(this.listAlreadyResults);
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
