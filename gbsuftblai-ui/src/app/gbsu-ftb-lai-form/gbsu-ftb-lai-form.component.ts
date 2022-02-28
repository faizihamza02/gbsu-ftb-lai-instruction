import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  inputNumber = new FormControl('');

  @Output()
  submitNumberOutput = new EventEmitter<any>();

  constructor() {

  }

  ngOnInit(): void {

  }

  submitNumber(): void { 
   this.submitNumberOutput.emit(this.inputNumber.value);
   this.inputNumber.setValue("");
  }

}
